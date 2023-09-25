package ngothanhcong.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="servicemodel")
	public class ServiceModel {
		@Id
		@Column(name="name")
		private String name;
		@Column(name="imdb")
		private String imdb;
		@Column(name="date")
		private String date;
		@Column(name="sposter")
		private String sposter;
		@Column(name="bposter")
		private String bposter;
		@Column(name="genre")
		private String genre;
		@Column(name="type")
		private String type;
		@Column(name="url")
		private String url;
		@Column(name="trailer")
		private String trailer;
		@Column(name="low")
		private String low;
		@Column(name="medium")
		private String medium;
		@Column(name="high")
		private String high;
		
//		public ServiceModel() {
//			
//		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getImdb() {
			return imdb;
		}
		public void setImdb(String imdb) {
			this.imdb = imdb;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getSposter() {
			return sposter;
		}
		public void setSposter(String sposter) {
			this.sposter = sposter;
		}
		public String getBposter() {
			return bposter;
		}
		public void setBposter(String bposter) {
			this.bposter = bposter;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getTrailer() {
			return trailer;
		}
		public void setTrailer(String trailer) {
			this.trailer = trailer;
		}
		public String getLow() {
			return low;
		}
		public void setLow(String low) {
			this.low = low;
		}
		public String getMedium() {
			return medium;
		}
		public void setMedium(String medium) {
			this.medium = medium;
		}
		public String getHigh() {
			return high;
		}
		public void setHigh(String high) {
			this.high = high;
		}

//		@Override
//		public String toString() {
//			return "ServiceModel [name=" + name + " , imdb=" + imdb + ", date=" + date + ", sposter=" + sposter
//					+ ", bposter=" + bposter + ", genre=" + genre + ", type=" + type + ", url=" + url + ", trailer="
//					+ trailer + ", low=" + low + ", medium=" + medium + ", high=" + high + "]" ;
//		}
		
	}

