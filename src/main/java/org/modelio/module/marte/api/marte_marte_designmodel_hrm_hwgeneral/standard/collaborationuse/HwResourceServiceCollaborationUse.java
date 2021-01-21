/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaborationuse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.GrServiceCollaborationUse;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CollaborationUse} with << HwResourceService_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f37fb636-e2c0-4042-b4d6-6a0ba910bc04")
public class HwResourceServiceCollaborationUse extends GrServiceCollaborationUse {
    @objid ("732a5741-cd77-4b7d-b572-1294137d20d0")
    public static final String STEREOTYPE_NAME = "HwResourceService_CollaborationUse";

    @objid ("c8f6f8d3-c488-4072-adfd-378a8f8cbf27")
    public static final String HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION_TAGTYPE = "HwResourceService_CollaborationUse_consumption";

    @objid ("5112bfd8-f4c7-439e-ad5d-6944d50af5e0")
    public static final String HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION_TAGTYPE = "HwResourceService_CollaborationUse_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << HwResourceService_CollaborationUse >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3774b8cb-4986-422b-b8ee-2dbb6fa7b7b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << HwResourceService_CollaborationUse >> then instantiate a {@link HwResourceServiceCollaborationUse} proxy.
     * 
     * @return a {@link HwResourceServiceCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    @objid ("67a6a10c-9fe1-45a8-ad73-42579d644d71")
    public static HwResourceServiceCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaborationUse.STEREOTYPE_NAME);
        return HwResourceServiceCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << HwResourceService_CollaborationUse >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link HwResourceServiceCollaborationUse} proxy or <i>null</i>.
     */
    @objid ("23673825-973c-4bf4-beb8-e269f2802028")
    public static HwResourceServiceCollaborationUse instantiate(final CollaborationUse obj) {
        return HwResourceServiceCollaborationUse.canInstantiate(obj) ? new HwResourceServiceCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << HwResourceService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link HwResourceServiceCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1f76d8e8-0278-41af-a712-af38f09a5e38")
    public static HwResourceServiceCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (HwResourceServiceCollaborationUse.canInstantiate(obj))
        	return new HwResourceServiceCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a7099a1f-b01b-489f-8aa3-8a09666f8541")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwResourceServiceCollaborationUse other = (HwResourceServiceCollaborationUse) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CollaborationUse}. 
     * @return the CollaborationUse represented by this proxy, never null.
     */
    @objid ("a89feef5-ae3b-4bc4-ac9f-f065d029efb3")
    @Override
    public CollaborationUse getElement() {
        return (CollaborationUse)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_CollaborationUse_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6921417-31f4-4ff5-a096-1923157e41a8")
    public String getHwResourceService_CollaborationUse_consumption() {
        return this.elt.getTagValue(HwResourceServiceCollaborationUse.MdaTypes.HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_CollaborationUse_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d7bb3ba-e463-4947-83b6-55b701bd0d03")
    public String getHwResourceService_CollaborationUse_dissipation() {
        return this.elt.getTagValue(HwResourceServiceCollaborationUse.MdaTypes.HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("f6c2dbaa-f461-4ddf-8e2c-e0491bb04628")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_CollaborationUse_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ad8492d-c21a-4353-9c45-7644f395e3b0")
    public void setHwResourceService_CollaborationUse_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaborationUse.MdaTypes.HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_CollaborationUse_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("159e95e7-052b-496c-89b7-1432a661b1af")
    public void setHwResourceService_CollaborationUse_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaborationUse.MdaTypes.HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("8e65a019-c8aa-4101-b513-fe90ce42832e")
    protected HwResourceServiceCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    @objid ("1530903a-2827-4f34-90f6-89ce302a94f6")
    public static final class MdaTypes {
        @objid ("acfe2fcb-466c-47f6-9ab9-133adce0d15b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8254d84c-a646-4e8b-8df9-17237944b5b3")
        public static TagType HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION_TAGTYPE_ELT;

        @objid ("f4cd691a-57c8-46af-8f7e-f6a0277ed2fc")
        public static TagType HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION_TAGTYPE_ELT;

        @objid ("2d0eca90-11c8-4061-8bca-ad45dec6d781")
        private static Stereotype MDAASSOCDEP;

        @objid ("6ccd00d8-18ee-42d9-b4d9-eb807284f8ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("69039188-657c-4125-a039-d44765bef303")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "019e61ba-0ccf-11df-8525-001302895b2b");
            HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2225ff77-1241-11df-8f55-0014222a9f79");
            HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2225ff76-1241-11df-8f55-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
