package br.edu.ifpb.praticas.jsf.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by diogomoreira on 06/09/16.
 */
@FacesValidator
public class DateValidador implements Validator {

    @Override
    public void validate(FacesContext facesContext,
                         UIComponent uiComponent,
                         Object o) throws ValidatorException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            format.parse(o.toString());
        } catch (ParseException e) {
            throw new ValidatorException(new FacesMessage
                    ("Erro", "Data inválida"));
        }
    }
}
