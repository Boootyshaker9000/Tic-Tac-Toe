public class Playing_field {
    private String[][] playing_field;

    public Playing_field() {
        this.playing_field = new String[3][3];
    }

    public void place_shape(){
        for (int i = 0; i < playing_field.length; i++){
            for (int j = 0; j < playing_field.length; j++){
                if (playing_field[i][j] == null){
                    System.out.println("Cell " + i + " " + j + " is available.");
                }
            }
        }
    }
}
