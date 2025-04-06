
// Basic Paramaters
double length  = 75;
double D  = 60;

CSG Link = new Cylinder(D/2.0, D/2.0, length, 64).toCSG();
Link = Link.union(new Sphere(D/2.0, 32, 32).toCSG().movez(length));

Link = Link.difference(new Cube(D, D, D).toCSG().movez(length).movex(-D/2));


Link.setColor(javafx.scene.paint.Color.BLUE);

return Link;

