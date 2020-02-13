public class Room {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid cuboid = new Cuboid(3.0,4.0,5.0);
		Cube cube = new Cube(6.0);
		Sphere sphere = new Sphere(3.0);
		VolumeCalculator vol = new VolumeCalculator();
		System.out.println("Volume of room is " + vol.calculateShapeVolume(cuboid));
		System.out.println("Volume of room is " + vol.calculateShapeVolume(cube));
		System.out.println("Volume of room is " + vol.calculateShapeVolume(sphere));
	}
}
