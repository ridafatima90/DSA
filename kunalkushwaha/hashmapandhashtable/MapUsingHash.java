package kunalkushwaha.hashmapandhashtable;

public class MapUsingHash {
    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){

    }

    private class Entity{
        private String key;
        private  String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    public static void main(String[] args) {

    }
}
