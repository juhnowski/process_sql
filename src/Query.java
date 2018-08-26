import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Query {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Address/Create Address.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Address/Delete Address.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Address/Get Address.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Address/Parse Address.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Address/Search Address.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Create Client.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/CreateUpdate User.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Delete Client.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Carrier Types.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Branch.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Characters.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Contact.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Contracts (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Org Form (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Segments.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Client Types.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Clients (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Information Source (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Official Status.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Okveds (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Get Okveds (paginated)_old.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Search Client.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Search Company Group.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Search Employee.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Search United Branch.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Spark Check For Closed Clients.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Client/Update Client.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contact/Get Contact.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contact/Get Contact Alternate Modes (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contact/Get Contact Branches (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contact/Get Contact Equipment Access Level List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contact/Get Contact Level List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contact/Search Contact.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Agent Billing Hosting Values.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Business Units.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Client Agree Private Info Values.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Client Service Levels.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Contract.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Fine Types.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Join Levels.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Peny RFR Values.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Get Profit Values.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Search Billing Cycles.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Search Billing Suppliers.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Search Contract.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Search Contract Type.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Search Oper License.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Contract/Search Operational Status.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Create Deal.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Delete Deal.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Get Deal.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Get Deal Priority (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Get Deal Type (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Search Deal.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Deal/Update Deal.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Billing (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product Ip Addresses.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product Netsize.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product Profile.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product Service.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product Service Params List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Product Service Params Values List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Get Service Action Types.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Search Business Centre.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product/Search Comission Schema.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Create Product In Deal.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Delete Product In Deal.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Get Product Instance.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Get Product Instance List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Get Product Service Instance List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Get Product Service Instance Params List (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Product Instance/Update Product In Deal.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Project/Project Release.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Report/Print Report 901.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Sale/Get Sales Process (paginated).process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Sale/Get Sales Stage (paginated).process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Bill Language.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Break Causes.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get ClirInvFTP.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Int Dom.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Invoice Delivery Modes.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Operator Coop Levels.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get QoS.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Scala.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Get Traffic Types.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Search Billing System.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Search Currency.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Search Fin Filial.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Search Invoice Send Print.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Search Scala.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Scala/Search Voice Traffic Detail.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Spark/Utility/Request to Spark.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Spark/Get Info From Spark.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Spark/GetCompanyAccountingReport.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Spark/GetCompanyExtendedReport.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Spark/GetCompanyShortReport.process");
        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/Processes/Spark/GetEntrepreneurShortReport.process");

        list.add("/Users/ilyayuknovskiy/Downloads/rmr/BusinessWorks/restapi/REST services/Client REST Service.process");


            list.forEach((fn) ->{
                try {
                    String content = readFile(fn, Charset.defaultCharset());
                    String newContent = parse(content); //Test.XML_ALL
                    writeFile(fn+"1", Charset.defaultCharset(), newContent);
                } catch (Exception e){
                    e.printStackTrace();
                }
            });
    }

    private static String parse(String xml){
        if (!xml.contains("<statement>SELECT")){
            System.out.println("No SQL Query");
            return xml;
        }
        String[] s1 = xml.split("<statement>SELECT");
        StringBuilder sb = new StringBuilder();
        sb.append(s1[0]); //xmlTop
        sb.append("<statement>SELECT ");
        String xmlBottom = s1[1].replace("*"," ");

        String[] s2 = s1[1].split("</QueryOutputCachedSchemaColumns>");
        System.out.println(s2.length);
        for (int i=0; i < s2.length-1; i++){
            sb.append(getColumn(s2[i]));
            if (i != s2.length-2) {
                sb.append(",");
            } else {
                sb.append(" ");
            }

        }

        sb.append(xmlBottom);
        String result = sb.toString();
       // System.out.println(result);
        return result;
    }

    public static String getColumn(String st){
        //String s = "<QueryOutputCachedSchemaColumns>ID</QueryOutputCachedSchemaColumns>";
        String[] sParam = st.split("<QueryOutputCachedSchemaColumns>");
        return sParam[1];
    }

    public static String readFile(String path, Charset encoding) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void writeFile(String path, Charset encoding, String aString) throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), encoding));
        try {
            out.write(aString);
        } finally {
            out.close();
        }
    }

}
