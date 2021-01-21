/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("6cd0ae1e-d46b-4e52-b68a-66e78c5d1f92")
    public static final String STEREOTYPE_NAME = "HwResourceService_Collaboration";

    @objid ("f2e9c7b3-8522-4e9d-aaf6-07d59416c7b4")
    public static final String HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE = "HwResourceService_Collaboration_consumption";

    @objid ("9622e171-6b2b-496e-95a7-dd7ce178f7f5")
    public static final String HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE = "HwResourceService_Collaboration_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << HwResourceService_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("03c1685e-330b-45db-b3f2-24155d1bf0e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << HwResourceService_Collaboration >> then instantiate a {@link HwResourceServiceCollaboration} proxy.
     * 
     * @return a {@link HwResourceServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("e444ede2-e00c-4b33-b8f7-f1c1d1aa2b4a")
    public static HwResourceServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaboration.STEREOTYPE_NAME);
        return HwResourceServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceCollaboration} proxy from a {@link Collaboration} stereotyped << HwResourceService_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link HwResourceServiceCollaboration} proxy or <i>null</i>.
     */
    @objid ("915f0d58-f807-4e7d-a92f-7cb9ad240e36")
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
    @objid ("6d4b4a87-1303-4069-9f18-69956e39964a")
    public static HwResourceServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (HwResourceServiceCollaboration.canInstantiate(obj))
        	return new HwResourceServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ba93ec43-6adc-432b-a773-81db92c9d46a")
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
    @objid ("a748ba61-319a-4350-a79c-8cf4007d5305")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Collaboration_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4547d1e0-ff87-4017-8841-3ab2f8124041")
    public String getHwResourceService_Collaboration_consumption() {
        return this.elt.getTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Collaboration_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b333832-d289-404f-ab84-ee5e44bfa555")
    public String getHwResourceService_Collaboration_dissipation() {
        return this.elt.getTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("5991c53f-f828-4d8e-a0d8-643c8c95bc7a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Collaboration_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1c61587-7f97-4b2f-84ec-3543e3fa4879")
    public void setHwResourceService_Collaboration_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Collaboration_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55b2e53e-358c-4817-9f38-2c354c629e58")
    public void setHwResourceService_Collaboration_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("b30e9e9d-c42f-4ac7-a25c-e80fcd3971d9")
    protected HwResourceServiceCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("8ef9f92c-c469-4d3c-a8ee-11f38bfb80a5")
    public static final class MdaTypes {
        @objid ("455c71f3-a004-4968-9c11-1c0f8a42a6e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4da1966e-213b-453c-b172-1bcba59245e9")
        public static TagType HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT;

        @objid ("c633c4e8-dd4a-4e6b-bbc9-4680c86a76c9")
        public static TagType HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT;

        @objid ("824ec871-84bf-4dd0-9f6c-6bd5dfee9a2b")
        private static Stereotype MDAASSOCDEP;

        @objid ("ade5dcf9-9315-46ba-a1d4-e0c92d1ec5f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e152d192-3343-44c7-b4f4-8a2df3020a73")
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
