public void button1_Click(object sender, System.EventArgs e)
{
	if(TextBox1.Text == "")
		Label4.Text = "Field can't be null";
	else
	{
		Label2.Text = "Success!";
		ListView1.Items.Clear();

		Form2 form2 = new Form2();
		form2.Show();
	}
}
