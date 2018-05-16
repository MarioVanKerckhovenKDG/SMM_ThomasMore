﻿using SMM_ThomasMore.Domain;
using System.Collections.Generic;

namespace SMM_ThomasMore.DAL
{
  public interface IUserRepository
    {
        IEnumerable<User> getUsers();
        User getUser(int id);
        IEnumerable<AlertInstellingen> GetAlertInstellingen();
        IEnumerable<Alert> GetAlerts();
        void addAlert(Alert a);
        void setALertGelezen(int alert_id);
        void AddAi(AlertInstellingen ai);
        void AddUser(User u, Deelplatform platform);
        void verifyUser(User id);
    }
}
