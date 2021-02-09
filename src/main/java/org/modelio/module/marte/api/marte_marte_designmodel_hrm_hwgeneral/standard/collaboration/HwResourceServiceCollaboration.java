/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwResourceServiceCollaboration extends GrServiceCollaboration {
    public static final String STEREOTYPE_NAME = "HwResourceService_Collaboration";

    public static final String HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE = "HwResourceService_Collaboration_consumption";

    public static final String HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE = "HwResourceService_Collaboration_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << HwResourceService_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << HwResourceService_Collaboration >> then instantiate a {@link HwResourceServiceCollaboration} proxy.
     * 
     * @return a {@link HwResourceServiceCollaboration} proxy on the created {@link Collaboration}.
     */
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
    public static HwResourceServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (HwResourceServiceCollaboration.canInstantiate(obj))
        	return new HwResourceServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Collaboration_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_Collaboration_consumption() {
        return this.elt.getTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Collaboration_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_Collaboration_dissipation() {
        return this.elt.getTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Collaboration_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_Collaboration_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Collaboration_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_Collaboration_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceCollaboration.MdaTypes.HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    protected HwResourceServiceCollaboration(final Collaboration elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCESERVICE_COLLABORATION_CONSUMPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCESERVICE_COLLABORATION_DISSIPATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
