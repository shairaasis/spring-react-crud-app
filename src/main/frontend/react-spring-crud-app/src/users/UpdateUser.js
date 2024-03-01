import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link, useParams, useNavigate } from 'react-router-dom';


export default function UpdateUser() {
    let navigate = useNavigate();

    const [user, setUser] = useState({
        name: "",
        username: "",
        email: "",
      });
    
      const { id } = useParams();
    
      useEffect(() => {
        loadUser();
      }, []);
    
      const loadUser = async () => {
        const result = await axios.get(`http://localhost:8080/users/user`, {
          params: {
            id: id
          }
        });
        setUser(result.data);
      };

      const onInputChange = (e) => {
        setUser({...user,[e.target.name]:e.target.value})
        }

        const onSubmit = async (e) => {
            alert("Are you shore?");
            e.preventDefault();
            await axios.put(`http://localhost:8080/users/updateUser/${user.id}`, user);
            navigate(`/viewuser/${user.id}`);
        }

    return(
        <div className='container'>
        <div className='row'>
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className='text-center m-4'>Update User</h2>
                <form onSubmit={(e)=>onSubmit(e)}>
                    <div className='mb-3'>
                        <label htmlFor='username' className='form-label'>Username</label>
                        <input type={'text'} className='form-control' placeholder='Enter you username' name='username' value={user.username} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className='mb-3'>
                        <label htmlFor='name' className='form-label'>Name</label>
                        <input type={'text'} className='form-control' placeholder='Enter you name' name='name' value={user.name} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className='mb-3'>
                        <label htmlFor='username' className='form-label'>Username</label>
                        <input type={'text'} className='form-control' placeholder='Enter you email' name='email' value={user.email} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <Link className='btn btn-outline-danger' to="/">Cancel</Link>
                    <button type='submit' className='btn btn-outline-primary mx-2'>Submit</button>
                </form>                
            </div>
        </div>
    </div>
    )
}