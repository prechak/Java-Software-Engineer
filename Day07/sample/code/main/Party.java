package main;

class Party {
    int point;
    public void setName(String name){  // Writable property
        
    }
    public void setPoint(int point){   // When hava set is Writable property
        this.point = point;
    }
    public boolean isOK(){
        return point >= 50;     // Readable
    }
}
