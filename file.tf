resource "name" "type"{
  instance_type = "t2.micro"
  availability_zone = var.zone1
  key_name= "ram"
}