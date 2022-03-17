import com.itextpdf.forms.fields.PdfFormField;

import java.util.Map;

public class CQFormField {
    // radio flag off
    public static final String RADIO_FLAG_OFF="/Off";

    // Applicant Type Q1
    public static final String APPLICANT_TYPE_Q1="Applicant Type Q1";
    public static final String APPLICANT_TYPE_Q1_1="Applicant Type Q1.1";
    public static final String APPLICANT_TYPE_Q1_1_VALUE="Reg 5 Cayman";
    public static final String APPLICANT_TYPE_Q1_2="Applicant Type Q1.2";
    public static final String APPLICANT_TYPE_Q1_2_VALUE="Regulated Entity";
    public static final String APPLICANT_TYPE_Q1_3="Applicant Type Q1.3";
    public static final String APPLICANT_TYPE_Q1_3_VALUE="Listed Entity";
    public static final String APPLICANT_TYPE_Q1_4="Applicant Type Q1.4";
    public static final String APPLICANT_TYPE_Q1_4_VALUE="Government";
    public static final String APPLICANT_TYPE_Q1_5="Applicant Type Q1.5";
    public static final String APPLICANT_TYPE_Q1_5_VALUE="Pension/Trade Union";



    public String applicantTypeQ1=null;


    public boolean hasRadioIsCheck(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrPdfName= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrPdfName==null || arrPdfName.length<1)
            return false;
        for (Object obj: arrPdfName) {
            if(obj!=null && RADIO_FLAG_OFF.equals(obj.toString())){
                return false;
            }
        }
        return true;
    }

}
