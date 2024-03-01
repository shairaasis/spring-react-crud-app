import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';
export default function Home() {
  let navigate = useNavigate();

  const [users,setUsers]=useState([])

  useEffect(() => {
    loadUsers();
  }, [])

  const loadUsers = async() => {
    const result = await axios.get("http://localhost:8080/users/all");
    setUsers(result.data);
  }

  const deleteUser = (e, id) =>  {
    e.preventDefault();
    console.log("delete btn clicked");
    console.log(id);
    axios.delete(`http://localhost:8080/users/deleteUser/${id}`);
    alert("user deleted!");
    loadUsers();
    navigate(`/`);

  }

  return (
    <div className='container'>
      <div className='py-4'>
      <table className="table border shadow">
        <thead>
          <tr>
            <th scope="col">Id</th>
            <th scope="col">Username</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody class="table-group-divider">
          {
            users.map((user,index) => (
              <tr>
                <th scope="row" key={index}>{index+1}</th>
                <td>{user.username}</td>
                <td>
                  <Link className='btn btn-primary mx-2' to={`/viewuser/${user.id}`}>View</Link>
                  <Link className='btn btn-outline-primary mx-2' to={`/updateuser/${user.id}`}>Update</Link>
                  <button onClick={(e, id )=>deleteUser(e, user.id)} className='btn btn-danger mx-2'>Delete</button>
                </td>
              </tr>
             ))
          }
          
        </tbody>
      </table>
      </div>
    </div>
  )
}
