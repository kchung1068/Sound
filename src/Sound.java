public class Sound {
	private int[] samples;
	
	public Sound(int[] s){
		samples = s;
	}
	
	public int limitAmplitude(int limit) {
		//Your Code Here
		int numOfValuesChanged = 0;

		for(int x = 0; x < samples.length; x += 1) {

			if (samples[x] > limit) {

				samples[x] = limit;

				numOfValuesChanged += 1;

			} else if (samples[x] < (limit * -1) ){

				samples[x] = limit * -1;

				numOfValuesChanged += 1;

			} else{

				numOfValuesChanged += 0;

			}



		}

		return numOfValuesChanged;
	}
		
	public void trimSilenceFromBeginning() {
		//Your Code Here
		int[] newSamples = new int[samples.length];
		int remove = 0;
		for (int x = 0; x < samples.length; x += 1) {

			if (samples[x] == 0) {
				remove += 1 ;


			} else if (samples[x] != 0) {
				break;
			}

		}
		newSamples = new int[samples.length - remove];

		for (int z = 0; z < samples.length; z += 1) {
			if (samples[z] == 0 ) {

			} else if (samples[z] != 0) {
				newSamples[z - remove] = samples[z];
			}
		}
		samples = newSamples;
	}
	
	public String toString(){
		String s = "[";
		for(int a=0;a < samples.length-1;a++)
			s+= samples[a] + ",";
		s += samples[samples.length-1] + "]";
		return s;
	}
}
