package ru.chkdev.androidproject5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DashboardCard (
    orders: String,
    conversion: String,
    revenue: String
){
    Card (
        modifier = Modifier.padding(16.dp)
            .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
    ){
        Column (
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(24.dp)
        ){
            Text("Dashboard",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
                )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Card (
                    modifier = Modifier
                        .weight(1f)
                        .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(16.dp)
                    ){
                        Text(orders,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text("Orders",
                            fontSize = 14.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(16.dp)
                    ) {
                        Text(conversion,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text("Conversion",
                            fontSize = 14.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(12.dp)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(16.dp)
                ) {
                    Text("Revenue",
                        fontSize = 14.sp,
                        color = Color.Gray,
                    )
                    Text(revenue,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardPreview(){
    DashboardCard(
        orders = "124",
        conversion = "82%",
        revenue = "124 500 ₽"
    )
}