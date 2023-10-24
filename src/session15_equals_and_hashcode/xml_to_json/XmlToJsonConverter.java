package session15_equals_and_hashcode.xml_to_json;


public class XmlToJsonConverter {

    public static void main(String[] args) throws Exception {

        // Throws ClassNotFoundException
//        String xml = "<bookstore>\n" +
//                "    <book>\n" +
//                "        <isbn>123-456-789</isbn>\n" +
//                "        <title>The Great Adventure</title>\n" +
//                "        <author>John Doe</author>\n" +
//                "        <price>19.99</price>\n" +
//                "    </book>\n" +
//                "    <book>\n" +
//                "        <isbn>789-101-112</isbn>\n" +
//                "        <title>Java Essentials</title>\n" +
//                "        <author>Jane Doe</author>\n" +
//                "        <price>29.99</price>\n" +
//                "    </book>\n" +
//                "</bookstore>";
//
//        XmlMapper xmlMapper = new XmlMapper();
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        Object json = mapper.readValue(xmlMapper.readValue(xml, Object.class).toString(), Object.class);
//
//        System.out.println(json);


        // Throws JsonParseException: ParseError at [row,col]:[1,1] -> Content is not allowed in prolog
//        XmlMapper xmlMapper1 = new XmlMapper();
//
//        ObjectMapper mapper1 = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        Object json1 = mapper1.readValue(xmlMapper1.readValue("src/session15_equals_and_hashcode/xml_to_json/Bookstore.xml", Object.class).toString(), Object.class);
//
//        System.out.println(json);
    }
}
