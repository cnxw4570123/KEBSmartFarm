import React from 'react'
import { Offcanvas } from 'react-bootstrap';
import { useDispatch } from 'react-redux';
import { logout } from '../store/isLoginSlice';

function NavUserInfo() {
  const dispatch = useDispatch();
  return (
    <>
    < div className = "offcanvas offcanvas-end" tabindex = "-1" id = "offcanvasRight" aria-labelledby="offcanvasRightLabel" >
      <div className="offcanvas-header">
          <h5 className="offcanvas-title" id="offcanvasRightLabel">User Info</h5>
          <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
          <div>
              nickname
          </div>
          <div>
              <button onClick={ () => dispatch(logout()) }>로그아웃</button>
          </div>
          <div>
              recent supply water date
          </div>
      </div>
      </div>
    </>
  )
};

export default NavUserInfo

    // <div>
    //     {/* <button class="btn btn-primary" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">Toggle right offcanvas</button> */}

    //     <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
    //         <div class="offcanvas-header">
    //             <h5 class="offcanvas-title" id="offcanvasRightLabel">Offcanvas right</h5>
    //             <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
    //         </div>
    //         <div class="offcanvas-body">
    //             ...
    //         </div>
    //     </div>
    // </div>