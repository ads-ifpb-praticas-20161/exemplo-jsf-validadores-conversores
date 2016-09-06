package br.edu.ifpb.praticas.jsf.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by diogomoreira on 06/09/16.
 */
@FacesConverter("dateConversor")
public class DateConversor implements Converter {

    private DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent,
                              String s) {
        Date dateFormatted = null;
        try {
            dateFormatted = formatter.parse(s);
        } catch (ParseException e) {
            throw new ConverterException(e);
        }
        return dateFormatted;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent,
                              Object o) {
        String dateAsString = formatter.format(o);
        return dateAsString;
    }

}
