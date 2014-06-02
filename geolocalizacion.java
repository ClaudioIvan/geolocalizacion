public class Geolocalizacion{

	Geolocalizacion(){
	
	}

public void localizar(String coord){
	
        String uri = "geo:" + coord + "?q=" + coord + "(" + nombre + ")";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
}

}