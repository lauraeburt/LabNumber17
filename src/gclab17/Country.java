package gclab17;

	public class Country {

		private String Country;
		private int population;
		
		public Country(String Country, int population) {
			this.Country = Country;
			this.population = population;
		}
		
		@Override
		public String toString() {
			return "Country Country = " + Country + ", population = " + population;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}
		
}


