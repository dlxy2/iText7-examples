import com.itextpdf.forms.fields.PdfFormField;

import java.util.Map;

public class CQFormField {
    // radio flag off
    public static final String RADIO_FLAG_OFF="/Off";
    public static final String KEY_VALUE_NAME="/V";

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

    // PEP
    public static final String PEP="PEP";
    public static final String PEP_1="PEP.1";
    public static final String PEP_1_VALUE="Yes";
    public static final String PEP_2="PEP.2";
    public static final String PEP_2_VALUE="No";

    // Ethical
    public static final String ETHICAL="Ethical";
    public static final String ETHICAL_1="Ethical.1";
    public static final String ETHICAL_1_VALUE="Yes";
    public static final String ETHICAL_2="Ethical.2";
    public static final String ETHICAL_2_VALUE="No";

    // Source of Funds Choice
    public static final String SOURCE_OF_FUNDS_CHOICE="Source of Funds Choice";
    public static final String SOURCE_OF_FUNDS_CHOICE_1="Source of Funds Choice.1";
    public static final String SOURCE_OF_FUNDS_CHOICE_1_VALUE="Corporate and other legal form";
    public static final String SOURCE_OF_FUNDS_CHOICE_2="Source of Funds Choice.2";
    public static final String SOURCE_OF_FUNDS_CHOICE_2_VALUE="Individual";

    // Investment Choice
    public static final String INVESTMENT_CHOICE="Investment Choice";
    public static final String INVESTMENT_CHOICE_1="Investment Choice.1";
    public static final String INVESTMENT_CHOICE_1_VALUE="On behalf of itself";
    public static final String INVESTMENT_CHOICE_2="Investment Choice.2";
    public static final String INVESTMENT_CHOICE_2_VALUE="On behalf of its customer";

    // Source of Funds - Individual
    public static final String SOURCE_OF_FUNDS_INDIVIDUAL="Source of Funds - Individual";
    public static final String SOURCE_OF_FUNDS_INDIVIDUAL_1_VALUE="Income, Revenue and Business Activities";
    public static final String SOURCE_OF_FUNDS_INDIVIDUAL_2_VALUE="Investment Activities";
    public static final String SOURCE_OF_FUNDS_INDIVIDUAL_3_VALUE="Family/Generational Wealth and Personal Backgrouds";

    // Employment Status - Individual
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL="Employment Status - Individual";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_1_TEXT="Currently not employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_1_VALUE="Not currently employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_2_TEXT="Fulltime employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_2_VALUE="Fulltime employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_3_TEXT="Parttime employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_3_VALUE="Parttime employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_4_TEXT="Self-employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_4_VALUE="Self-employed";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_5_TEXT="Student";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_5_VALUE="Student";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_6_TEXT="House Wife";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_6_VALUE="HouseWife";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_7_TEXT="Retired";
    public static final String EMPLOYMENT_STATUS_INDIVIDUAL_7_VALUE="Retired";

    // Job Nature - Individual
    public static final String JOB_NATURE_INDIVIDUAL="Job Nature - Individual";
    public static final String JOB_NATURE_INDIVIDUAL_1_VALUE="Agriculture";
    public static final String JOB_NATURE_INDIVIDUAL_2_VALUE="Industry - Mining and quarrying; Electricity, gas and water supply";
    public static final String JOB_NATURE_INDIVIDUAL_3_VALUE="Industry - Construction";
    public static final String JOB_NATURE_INDIVIDUAL_4_VALUE="Industry - Manufacturing";
    public static final String JOB_NATURE_INDIVIDUAL_5_VALUE="Services - Trade";
    public static final String JOB_NATURE_INDIVIDUAL_6_VALUE="Services - Transportation and storage";
    public static final String JOB_NATURE_INDIVIDUAL_7_VALUE="Services - Accommodation and food service activities";
    public static final String JOB_NATURE_INDIVIDUAL_8_VALUE="Services - Real estate activities";
    public static final String JOB_NATURE_INDIVIDUAL_9_VALUE="Services - Information and communication";
    public static final String JOB_NATURE_INDIVIDUAL_10_VALUE="Services - Financial and insurance activities";
    public static final String JOB_NATURE_INDIVIDUAL_11_VALUE="Services - Legal and accounting activities";
    public static final String JOB_NATURE_INDIVIDUAL_12_VALUE="Services - Management consultancy activities";
    public static final String JOB_NATURE_INDIVIDUAL_13_VALUE="Services - Advertising and market research";
    public static final String JOB_NATURE_INDIVIDUAL_14_VALUE="Services - Other professional, scientific and technical activities";
    public static final String JOB_NATURE_INDIVIDUAL_15_VALUE="Services - Public administration and defence; compulsory social security";
    public static final String JOB_NATURE_INDIVIDUAL_16_VALUE="Services - Education";
    public static final String JOB_NATURE_INDIVIDUAL_17_VALUE="Services - Human health and social work activities";
    public static final String JOB_NATURE_INDIVIDUAL_18_VALUE="Services - Arts, entertainment and recreation";
    public static final String JOB_NATURE_INDIVIDUAL_19_VALUE="Other activities";

    // Job Level
    public static final String JOB_LEVEL="Job Level";
    public static final String JOB_LEVEL_1_VALUE="Managers - Chief Executives, Senior Officials and Legislators";
    public static final String JOB_LEVEL_2_VALUE="Managers - Others";
    public static final String JOB_LEVEL_3_VALUE="Professionals";
    public static final String JOB_LEVEL_4_VALUE="Technicians and Associate Professionals";
    public static final String JOB_LEVEL_5_VALUE="Workers";

    // Name of EmployerBusiness - Individual
    public static final String NAME_OF_EBI="Name of EmployerBusiness - Individual";

    // Employment Start Date
    public static final String EMPLOYMENT_START_DATE ="Employment Start Date";

    //Business Industry
    public static final String BUSINESS_INDUSTRY="Business Industry";
    public static final String BUSINESS_INDUSTRY_1_VALUE="Energy";
    public static final String BUSINESS_INDUSTRY_2_VALUE="Materials";
    public static final String BUSINESS_INDUSTRY_3_VALUE="Industrials";
    public static final String BUSINESS_INDUSTRY_4_VALUE="Consumer Discretionary";
    public static final String BUSINESS_INDUSTRY_5_VALUE="Consumer Staples";
    public static final String BUSINESS_INDUSTRY_6_VALUE="Health Care";
    public static final String BUSINESS_INDUSTRY_7_VALUE="Financials";
    public static final String BUSINESS_INDUSTRY_8_VALUE="Information Technology";
    public static final String BUSINESS_INDUSTRY_9_VALUE="Communication Services";
    public static final String BUSINESS_INDUSTRY_10_VALUE="Utilities";
    public static final String BUSINESS_INDUSTRY_11_VALUE="Real Estate";

    //Part 5.2.c.(1) Yes
    public static final String PART_52C_YES_1="5.2.C.(1) Yes";
    public static final String PART_52C_YES_2="5.2.C.(2) Yes";
    public static final String PART_52C_YES_3="5.2.C.(3) Yes";
    public static final String PART_52C_YES_4="5.2.C.(4) Yes";
    public static final String PART_52C_YES_5="5.2.C.(5) Yes";
    public static final String PART_52C_YES_6="5.2.C.(6) Yes";
    public static final String PART_52C_YES_7="5.2.C.(7) Yes";


    public String applicantTypeQ1=null;
    public String applicantTypeQ2=null;
    public String regularCustomerType=null;
    public String pep=null;
    public String ethical=null;
    public String sourceOfFundsChoice=null;
    public String investmentChoice=null;
    public String sourceOfFundsIndividual=null;
    public String employmentStatusIndividual=null;
    public String jobNatureIndividual=null;
    public String jobLevel=null;
    public String nameOfEmployerBusinessIndividual=null;
    public String employmentStartDate=null;
    public String businessIndustry=null;
    public String part52cYes1=null;
    public String part52cYes2=null;
    public String part52cYes3=null;
    public String part52cYes4=null;
    public String part52cYes5=null;
    public String part52cYes6=null;
    public String part52cYes7=null;


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

    public String getSourceOfFundsIndividualValue(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrKeys=fields.get(fieldKey).getPdfObject().keySet().toArray();
        Object[] arrValues= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrKeys==null || arrValues==null || arrValues.length<1)
            return "";
        for (int objIndex=0;objIndex<arrValues.length;objIndex++) {
            if(arrKeys[objIndex]!=null && KEY_VALUE_NAME.equals(arrKeys[objIndex].toString())){
                if(arrValues[objIndex]!=null && SOURCE_OF_FUNDS_INDIVIDUAL_1_VALUE.equals(arrValues[objIndex].toString())){
                    return SOURCE_OF_FUNDS_INDIVIDUAL_1_VALUE;
                }else if(arrValues[objIndex]!=null && SOURCE_OF_FUNDS_INDIVIDUAL_2_VALUE.equals(arrValues[objIndex].toString())){
                    return SOURCE_OF_FUNDS_INDIVIDUAL_2_VALUE;
                }else if(arrValues[objIndex]!=null && SOURCE_OF_FUNDS_INDIVIDUAL_3_VALUE.equals(arrValues[objIndex].toString())){
                    return SOURCE_OF_FUNDS_INDIVIDUAL_3_VALUE;
                }
            }

        }
        return "";
    }


    public String getEmploymentStatusIndividualValue(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrKeys=fields.get(fieldKey).getPdfObject().keySet().toArray();
        Object[] arrValues= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrKeys==null || arrValues==null || arrValues.length<1)
            return "";
        for (int objIndex=0;objIndex<arrValues.length;objIndex++) {
            if(arrKeys[objIndex]!=null && KEY_VALUE_NAME.equals(arrKeys[objIndex].toString())){
                if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_1_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_1_VALUE;
                }else if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_2_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_2_VALUE;
                }else if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_3_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_3_VALUE;
                }else if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_4_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_4_VALUE;
                }else if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_5_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_5_VALUE;
                }else if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_6_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_6_VALUE;
                }else if(arrValues[objIndex]!=null && EMPLOYMENT_STATUS_INDIVIDUAL_7_TEXT.equals(arrValues[objIndex].toString())){
                    return EMPLOYMENT_STATUS_INDIVIDUAL_7_VALUE;
                }
            }

        }
        return "";
    }


    public String getJobNatureIndividualValue(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrKeys=fields.get(fieldKey).getPdfObject().keySet().toArray();
        Object[] arrValues= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrKeys==null || arrValues==null || arrValues.length<1)
            return "";
        for (int objIndex=0;objIndex<arrValues.length;objIndex++) {
            if(arrKeys[objIndex]!=null && KEY_VALUE_NAME.equals(arrKeys[objIndex].toString())){
                if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_1_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_1_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_2_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_2_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_3_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_3_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_4_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_4_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_5_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_5_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_6_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_6_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_7_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_7_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_8_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_8_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_9_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_9_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_10_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_10_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_11_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_11_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_12_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_12_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_13_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_13_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_14_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_14_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_15_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_15_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_16_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_16_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_17_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_17_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_18_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_18_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_NATURE_INDIVIDUAL_19_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_NATURE_INDIVIDUAL_19_VALUE;
                }
            }

        }
        return "";
    }


    public String getJobLevelValue(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrKeys=fields.get(fieldKey).getPdfObject().keySet().toArray();
        Object[] arrValues= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrKeys==null || arrValues==null || arrValues.length<1)
            return "";
        for (int objIndex=0;objIndex<arrValues.length;objIndex++) {
            if(arrKeys[objIndex]!=null && KEY_VALUE_NAME.equals(arrKeys[objIndex].toString())){
                if(arrValues[objIndex]!=null && JOB_LEVEL_1_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_LEVEL_1_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_LEVEL_2_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_LEVEL_2_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_LEVEL_3_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_LEVEL_3_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_LEVEL_4_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_LEVEL_4_VALUE;
                }else if(arrValues[objIndex]!=null && JOB_LEVEL_5_VALUE.equals(arrValues[objIndex].toString())){
                    return JOB_LEVEL_5_VALUE;
                }
            }
        }
        return "";
    }


    public String getFormFieldTextValue(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrKeys=fields.get(fieldKey).getPdfObject().keySet().toArray();
        Object[] arrValues= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrKeys==null || arrValues==null || arrValues.length<1)
            return "";
        for (int objIndex=0;objIndex<arrValues.length;objIndex++) {
            if(arrKeys[objIndex]!=null && KEY_VALUE_NAME.equals(arrKeys[objIndex].toString())){
                if(arrValues[objIndex]!=null){
                    return arrValues[objIndex].toString();
                }
            }
        }
        return "";
    }


    public String getBusinessIndustryValue(Map<String, PdfFormField> fields,String fieldKey){
        Object[] arrKeys=fields.get(fieldKey).getPdfObject().keySet().toArray();
        Object[] arrValues= fields.get(fieldKey).getPdfObject().values().toArray();
        if(arrKeys==null || arrValues==null || arrValues.length<1)
            return "";
        for (int objIndex=0;objIndex<arrValues.length;objIndex++) {
            if(arrKeys[objIndex]!=null && KEY_VALUE_NAME.equals(arrKeys[objIndex].toString())){
                if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_1_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_1_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_2_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_2_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_3_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_3_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_4_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_4_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_5_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_5_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_6_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_6_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_7_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_7_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_8_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_8_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_9_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_9_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_10_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_10_VALUE;
                }else if(arrValues[objIndex]!=null && BUSINESS_INDUSTRY_11_VALUE.equals(arrValues[objIndex].toString())){
                    return BUSINESS_INDUSTRY_11_VALUE;
                }
            }

        }
        return "";
    }

}
