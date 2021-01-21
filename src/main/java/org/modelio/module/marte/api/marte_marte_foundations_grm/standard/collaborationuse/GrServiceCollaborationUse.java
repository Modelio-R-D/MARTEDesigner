/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CollaborationUse} with << GrService_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7edb3897-1660-44b8-b3b1-62f5ddffc8f4")
public class GrServiceCollaborationUse {
    @objid ("7588a2d2-5199-4f82-a909-2051ef2e1f9b")
    public static final String STEREOTYPE_NAME = "GrService_CollaborationUse";

    @objid ("13bbfc9e-133d-47bb-8bd3-9d585e61705c")
    public static final String GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE = "GrService_CollaborationUse_owner";

    /**
     * The underlying {@link CollaborationUse} represented by this proxy, never null.
     */
    @objid ("bd459927-1724-48ae-8ce5-2e5159eac773")
    protected final CollaborationUse elt;

    /**
     * Tells whether a {@link GrServiceCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << GrService_CollaborationUse >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4cfac644-0807-4219-a54a-811f00f5324e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << GrService_CollaborationUse >> then instantiate a {@link GrServiceCollaborationUse} proxy.
     * 
     * @return a {@link GrServiceCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    @objid ("724f47f8-68bc-426b-8273-c7ba25dda6cb")
    public static GrServiceCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaborationUse.STEREOTYPE_NAME);
        return GrServiceCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << GrService_CollaborationUse >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link GrServiceCollaborationUse} proxy or <i>null</i>.
     */
    @objid ("449ca7df-3419-4b5c-b8f6-5d670d2ef12a")
    public static GrServiceCollaborationUse instantiate(final CollaborationUse obj) {
        return GrServiceCollaborationUse.canInstantiate(obj) ? new GrServiceCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << GrService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link GrServiceCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dab2c9f9-b5c0-470f-a578-b050d6244a4b")
    public static GrServiceCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (GrServiceCollaborationUse.canInstantiate(obj))
        	return new GrServiceCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("GrServiceCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0fa20b74-a762-47da-9b7c-d6a75690fc1e")
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
        GrServiceCollaborationUse other = (GrServiceCollaborationUse) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CollaborationUse}. 
     * @return the CollaborationUse represented by this proxy, never null.
     */
    @objid ("140f0700-9885-480f-9b64-8a3eb5f698f2")
    public CollaborationUse getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_CollaborationUse_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c72da39c-0042-4167-8f4c-794b9d388c15")
    public String getGrService_CollaborationUse_owner() {
        return this.elt.getTagValue(GrServiceCollaborationUse.MdaTypes.GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT);
    }

    @objid ("da6bb934-5ebc-46df-9822-cc81163a70fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_CollaborationUse_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc63e2b3-2c72-4e5f-9450-541fdc50ef40")
    public void setGrService_CollaborationUse_owner(final String value) {
        this.elt.putTagValue(GrServiceCollaborationUse.MdaTypes.GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("4af2cfb1-fb29-47ec-aa3d-9cb6d0990112")
    protected GrServiceCollaborationUse(final CollaborationUse elt) {
        this.elt = elt;
    }

    @objid ("ee4dac63-eb68-41fe-8282-6e036e4f3598")
    public static final class MdaTypes {
        @objid ("659907b2-8191-4da2-bf54-c4213c5b9328")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f72ccf6b-6dfe-46be-a57e-963c1d190cca")
        public static TagType GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT;

        @objid ("a74dc20c-64a9-41f5-b83f-0781c7d0de2f")
        private static Stereotype MDAASSOCDEP;

        @objid ("714d7117-3fed-4a30-93b8-4f6c09d20a2a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9424512-3ca4-4ee0-bbe0-58dac1b6b810")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a8d2ba-0ccf-11df-8525-001302895b2b");
            GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a8d2bd-0ccf-11df-8525-001302895b2b");
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
