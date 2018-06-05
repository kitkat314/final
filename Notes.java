public class Notes
{
   public static int C0 = 0x00;
   public static int C1 = 0x0C;
   public static int C2 = 0x18;
   public static int C3 = 0x24;
   public static int C4 = 0x30;
   public static int C5 = 0x3C;
   public static int C6 = 0x48;
   public static int C7 = 0x54;
   public static int C8 = 0x60;
   public static int C9 = 0x6C;
   public static int C10 = 0x78;
   
   //Db
   public static int CS0 = 0x01;
   public static int CS1 = 0x0D;
   public static int CS2 = 0x19;
   public static int CS3 = 0x25;
   public static int CS4 = 0x31;
   public static int CS5 = 0x3D;
   public static int CS6 = 0x49;
   public static int CS7 = 0x55;
   public static int CS8 = 0x61;
   public static int CS9 = 0x6D;
   public static int CS10 = 0x79;
   
   public static int D0 = 0x02;
   public static int D1 = 0x0E;
   public static int D2 = 0x1A;
   public static int D3 = 0x26;
   public static int D4 = 0x32;
   public static int D5 = 0x3E;
   public static int D6 = 0x4A;
   public static int D7 = 0x56;
   public static int D8 = 0x62;
   public static int D9 = 0x6E;
   public static int D10 = 0x7A;
   
   //Eb
   public static int DS0 = 0x03;
   public static int DS1 = 0x0F;
   public static int DS2 = 0x1B;
   public static int DS3 = 0x27;
   public static int DS4 = 0x33;
   public static int DS5 = 0x3F;
   public static int DS6 = 0x4B;
   public static int DS7 = 0x57;
   public static int DS8 = 0x63;
   public static int DS9 = 0x6F;
   public static int DS10 = 0x7B;
   
   public static int E0 = 0x04;
   public static int E1 = 0x10;
   public static int E2 = 0x1C;
   public static int E3 = 0x28;
   public static int E4 = 0x34;
   public static int E5 = 0x40;
   public static int E6 = 0x4C;
   public static int E7 = 0x58;
   public static int E8 = 0x64;
   public static int E9 = 0x70;
   public static int E10 = 0x7C;
   
   public static int F0 = 0x05;
   public static int F1 = 0x11;
   public static int F2 = 0x1D;
   public static int F3 = 0x29;
   public static int F4 = 0x35;
   public static int F5 = 0x41;
   public static int F6 = 0x4D;
   public static int F7 = 0x59;
   public static int F8 = 0x65;
   public static int F9 = 0x71;
   public static int F10 = 0x7D;
   
   //Gb
   public static int FS0 = 0x06;
   public static int FS1 = 0x12;
   public static int FS2 = 0x1E;
   public static int FS3 = 0x2A;
   public static int FS4 = 0x36;
   public static int FS5 = 0x42;
   public static int FS6 = 0x4E;
   public static int FS7 = 0x5A;
   public static int FS8 = 0x66;
   public static int FS9 = 0x72;
   public static int FS10 = 0x7E;
   
   public static int G0 = 0x07;
   public static int G1 = 0x13;
   public static int G2 = 0x1F;
   public static int G3 = 0x2B;
   public static int G4 = 0x37;
   public static int G5 = 0x43;
   public static int G6 = 0x4F;
   public static int G7 = 0x5B;
   public static int G8 = 0x67;
   public static int G9 = 0x73;
   public static int G10 = 0x7F;
   
   //Ab
   public static int GS0 = 0x08;
   public static int GS1 = 0x14;
   public static int GS2 = 0x20;
   public static int GS3 = 0x2C;
   public static int GS4 = 0x38;
   public static int GS5 = 0x44;
   public static int GS6 = 0x50;
   public static int GS7 = 0x5C;
   public static int GS8 = 0x68;
   public static int GS9 = 0x74;
   
   public static int A0 = 0x09;
   public static int A1 = 0x15;
   public static int A2 = 0x21;
   public static int A3 = 0x2D;
   public static int A4 = 0x39;
   public static int A5 = 0x45;
   public static int A6 = 0x51;
   public static int A7 = 0x5D;
   public static int A8 = 0x69;
   public static int A9 = 0x75;
   
   //Bb
   public static int AS0 = 0x0A;
   public static int AS1 = 0x16;
   public static int AS2 = 0x22;
   public static int AS3 = 0x2E;
   public static int AS4 = 0x3A;
   public static int AS5 = 0x46;
   public static int AS6 = 0x52;
   public static int AS7 = 0x5E;
   public static int AS8 = 0x6A;
   public static int AS9 = 0x76;
   
   public static int B0 = 0x0B;
   public static int B1 = 0x17;
   public static int B2 = 0x23;
   public static int B3 = 0x2F;
   public static int B4 = 0x3B;
   public static int B5 = 0x47;
   public static int B6 = 0x53;
   public static int B7 = 0x5F;
   public static int B8 = 0x6B;
   public static int B9 = 0x77;
   
   public static int getKey(String note)
   {
      switch(note)
      {
      case "C0": return C0;
      case "C1": return C1;
      case "C2": return C2;
      case "C3": return C3;
      case "C4": return C4;
      case "C5": return C5;
      case "C6": return C6;
      case "C7": return C7;
      case "C8": return C8;
      case "C9": return C9;
      case "C10": return C10;
      
      case "CS0": return CS0;
      case "CS1": return CS1;
      case "CS2": return CS2;
      case "CS3": return CS3;
      case "CS4": return CS4;
      case "CS5": return CS5;
      case "CS6": return CS6;
      case "CS7": return CS7;
      case "CS8": return CS8;
      case "CS9": return CS9;
      case "CS10": return CS10;
      
      case "D0": return D0;
      case "D1": return D1;
      case "D2": return D2;
      case "D3": return D3;
      case "D4": return D4;
      case "D5": return D5;
      case "D6": return D6;
      case "D7": return D7;
      case "D8": return D8;
      case "D9": return D9;
      case "D10": return D10;
      
      case "DS0": return DS0;
      case "DS1": return DS1;
      case "DS2": return DS2;
      case "DS3": return DS3;
      case "DS4": return DS4;
      case "DS5": return DS5;
      case "DS6": return DS6;
      case "DS7": return DS7;
      case "DS8": return DS8;
      case "DS9": return DS9;
      case "DS10": return DS10;
      
      case "E0": return E0;
      case "E1": return E1;
      case "E2": return E2;
      case "E3": return E3;
      case "E4": return E4;
      case "E5": return E5;
      case "E6": return E6;
      case "E7": return E7;
      case "E8": return E8;
      case "E9": return E9;
      case "E10": return E10;
      
      case "F0": return F0;
      case "F1": return F1;
      case "F2": return F2;
      case "F3": return F3;
      case "F4": return F4;
      case "F5": return F5;
      case "F6": return F6;
      case "F7": return F7;
      case "F8": return F8;
      case "F9": return F9;
      case "F10": return F10;
      
      case "FS0": return FS0;
      case "FS1": return FS1;
      case "FS2": return FS2;
      case "FS3": return FS3;
      case "FS4": return FS4;
      case "FS5": return FS5;
      case "FS6": return FS6;
      case "FS7": return FS7;
      case "FS8": return FS8;
      case "FS9": return FS9;
      case "FS10": return FS10;
      
      case "G0": return G0;
      case "G1": return G1;
      case "G2": return G2;
      case "G3": return G3;
      case "G4": return G4;
      case "G5": return G5;
      case "G6": return G6;
      case "G7": return G7;
      case "G8": return G8;
      case "G9": return G9;
      case "G10": return G10;
      
      case "GS0": return GS0;
      case "GS1": return GS1;
      case "GS2": return GS2;
      case "GS3": return GS3;
      case "GS4": return GS4;
      case "GS5": return GS5;
      case "GS6": return GS6;
      case "GS7": return GS7;
      case "GS8": return GS8;
      case "GS9": return GS9;
           
      case "A0": return A0;
      case "A1": return A1;
      case "A2": return A2;
      case "A3": return A3;
      case "A4": return A4;
      case "A5": return A5;
      case "A6": return A6;
      case "A7": return A7;
      case "A8": return A8;
      case "A9": return A9;
      
      case "AS0": return AS0;
      case "AS1": return AS1;
      case "AS2": return AS2;
      case "AS3": return AS3;
      case "AS4": return AS4;
      case "AS5": return AS5;
      case "AS6": return AS6;
      case "AS7": return AS7;
      case "AS8": return AS8;
      case "AS9": return AS9;
      
      case "B0": return B0;
      case "B1": return B1;
      case "B2": return B2;
      case "B3": return B3;
      case "B4": return B4;
      case "B5": return B5;
      case "B6": return B6;
      case "B7": return B7;
      case "B8": return B8;
      case "B9": return B9;
      }
      return 0;
   }

}