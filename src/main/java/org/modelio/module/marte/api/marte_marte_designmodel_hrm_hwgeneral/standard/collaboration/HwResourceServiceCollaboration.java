/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.GrServiceCollaboration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << HwResourceService_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d3071b46-4b58-4a2e-99ec-353daf07b3df")
public class HwResourceServiceCollaboration extends GrServiceCollaboration {
    @objid ("2ab470a2-06bd-400f-9cba-e3e83e8f60a3")
    public static final String STEREOTYPE_NAME = "HwResourceService_Collaboration";

    @objid ("0f19abb1-1a8d-4ab1-96bd-7993f1c7ed91")
    public static final String HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE = "HwResourceService_Collaboration_consumption";

    @objid ("573dbf14-090f-4c22-a257-5603c8fdb0c5")
    public static final String HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE = "HwResourceService_Collaboration_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << HwResourceService_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9bc06fa5-aa5b-4c8c-9ab5-50cfb62ebb5f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << HwResourceService_Collaboration >> then instantiate a {@link HwResourceServiceCollaboration} proxy.
     * 
     * @return a {@link HwResourceServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("9521cfca-a9ef-42c5-97c6-7cc7755c2d5d")
    public static HwResourceServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaboration.STEREOTYPE_NAME);
        return HwResourceServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceCollaboration} proxy from a {@link Collaboration} stereotyped << HwResourceService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link HwResourceServiceCollaboration} proxy or <i>null</i>.
     */
    @objid ("7e6290aa-e3e5-4269-8d8d-f4e8d2307573")
    public static HwResourceServiceCollaboration instantiate(final Collaboration obj) {
        return HwResourceServiceCollaboration.canInstantiate(obj) ? new HwResourceServiceCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceCollaboration} proxy from a {@link Collaboration} stereotyped << HwResourceService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link HwResourceServiceCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9248d3e-082b-46fd-9d1e-7af8bc5d11be")
    public static HwResourceServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (HwResourceServiceCollaboration.canInstantiate(obj))
        	return new HwResourceServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("83f94062-269a-40a8-ab89-0b05d5c78d59")
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
        HwResourceServiceCollaboration other = (HwResourceServiceCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("a1b121ab-930e-462a-afd7-284e0700ca30")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Collaboration_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6b7dfef-6175-4d38-8aed-a30cfaf8fbdf")
    public String getHwResourceService_Collaboration_consumption() {
        return this.elt.getTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Collaboration_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8538b78-54ef-4128-bfa4-318fbc612335")
    public String getHwResourceService_Collaboration_dissipation() {
        return this.elt.getTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("3aafe50d-d468-4c9b-8158-776b85dae83c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Collaboration_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24e54e53-16ef-4e11-9ed9-60acb4f33d5a")
    public void setHwResourceService_Collaboration_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Collaboration_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4a2cb15-ec7d-488d-bc03-45cca44c6bc4")
    public void setHwResourceService_Collaboration_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("db26032e-bed8-47a1-9560-1f6ef08e0e4a")
    protected HwResourceServiceCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("8ef9f92c-c469-4d3c-a8ee-11f38bfb80a5")
    public static final class MdaTypes {
        @objid ("1ca5df33-d8c2-40e6-91c8-0f8a358edf5a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a258d6fa-4fc8-489b-9f40-f9c37f6e14d6")
        public static TagType HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT;

        @objid ("3d1c6494-bd5d-4159-b7f6-be48e50723c5")
        public static TagType HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT;

        @objid ("df12dc98-8257-4e02-b3fc-83f9c5e81460")
        private static Stereotype MDAASSOCDEP;

        @objid ("ced6a5a4-0493-48f1-894f-4544609d49d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("674ade13-6f7b-424e-a20a-14768820e44b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "019e61b9-0ccf-11df-8525-001302895b2b");
            HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21247ef7-1241-11df-8f55-0014222a9f79");
            HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21247ef6-1241-11df-8f55-0014222a9f79");
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
