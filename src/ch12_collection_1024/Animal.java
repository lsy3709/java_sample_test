package ch12_collection_1024;

public class Animal implements Comparable<Animal>{

	private int animalId;        //animal 아이디
	private String animalName;   //animal 이름

	public Animal(int animalId, String animalName){ //생성자
		this.animalId = animalId;
		this.animalName = animalName;
	}
	
	public int getanimalId() {  //
		return animalId;
	}
	public void setanimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getanimalName() {
		return animalName;
	}
	public void setanimalName(String animalName) {
		this.animalName = animalName;
	}
	
	//기존 Object 에 있는 메서드를 그대로 사용하기 싫어서 재정의.
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return animalName + " animal의 아이디는 " + animalId + "입니다";
	}

	@Override
	public int hashCode() {
		return animalId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Animal){
			Animal animal = (Animal)obj;
			if( this.animalId == animal.animalId )
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Animal animal) {
		
		//return (this.animalId - member.animalId);   //오름차순
		return (this.animalId - animal.animalId) *  (-1);   //내림 차순
	}
}




