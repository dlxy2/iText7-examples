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

    // Applicant Type Q2
    public static final String APPLICANT_TYPE_Q2="Applicant Type Q2";
    public static final String APPLICANT_TYPE_Q2_1="Applicant Type Q2.1";
    public static final String APPLICANT_TYPE_Q2_1_VALUE="Exempted customer";
    public static final String APPLICANT_TYPE_Q2_2="Applicant Type Q2.2";
    public static final String APPLICANT_TYPE_Q2_2_VALUE="Nomiee/Agent";
    public static final String APPLICANT_TYPE_Q2_3="Applicant Type Q2.3";
    public static final String APPLICANT_TYPE_Q2_3_VALUE="Eligible Intoducer";

    // Regular Customer Type
    public static final String REGULAR_CUSTOMER_TYPE="Regular Customer Type";
    public static final String REGULAR_CUSTOMER_TYPE_1="Regular Customer Type.1";
    public static final String REGULAR_CUSTOMER_TYPE_1_VALUE="Individual";
    public static final String REGULAR_CUSTOMER_TYPE_2="Regular Customer Type.2";
    public static final String REGULAR_CUSTOMER_TYPE_2_VALUE="Corporate";
    public static final String REGULAR_CUSTOMER_TYPE_3="Regular Customer Type.3";
    public static final String REGULAR_CUSTOMER_TYPE_3_VALUE="Partnership/Unincorporated";
    public static final String REGULAR_CUSTOMER_TYPE_4="Regular Customer Type.4";
    public static final String REGULAR_CUSTOMER_TYPE_4_VALUE="Trust, NPO & Other";


    public String applicantTypeQ1=null;
    public String applicantTypeQ2=null;
    public String regularCustomerType=null;


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
