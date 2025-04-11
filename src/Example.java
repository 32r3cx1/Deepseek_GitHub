public class Example {
    public void process(List<String> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).length(); j++) {
                System.out.println(data.get(i).charAt(j));
            }
        }
    }
}
