/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.executionspecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.GrServiceExecutionSpecification;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ExecutionSpecification} with << HwResourceService_ExecutionSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwResourceServiceExecutionSpecification extends GrServiceExecutionSpecification {
    public static final String STEREOTYPE_NAME = "HwResourceService_ExecutionSpecification";

    public static final String HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE = "HwResourceService_ExecutionSpecification_consumption";

    public static final String HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE = "HwResourceService_ExecutionSpecification_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >> then instantiate a {@link HwResourceServiceExecutionSpecification} proxy.
     * 
     * @return a {@link HwResourceServiceExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    public static HwResourceServiceExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceExecutionSpecification.STEREOTYPE_NAME);
        return HwResourceServiceExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link HwResourceServiceExecutionSpecification} proxy or <i>null</i>.
     */
    public static HwResourceServiceExecutionSpecification instantiate(final ExecutionSpecification obj) {
        return HwResourceServiceExecutionSpecification.canInstantiate(obj) ? new HwResourceServiceExecutionSpecification(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ExecutionSpecification}
     * @return a {@link HwResourceServiceExecutionSpecification} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwResourceServiceExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (HwResourceServiceExecutionSpecification.canInstantiate(obj))
        	return new HwResourceServiceExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwResourceServiceExecutionSpecification other = (HwResourceServiceExecutionSpecification) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ExecutionSpecification}. 
     * @return the ExecutionSpecification represented by this proxy, never null.
     */
    @Override
    public ExecutionSpecification getElement() {
        return (ExecutionSpecification)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_ExecutionSpecification_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_ExecutionSpecification_consumption() {
        return this.elt.getTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_ExecutionSpecification_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_ExecutionSpecification_dissipation() {
        return this.elt.getTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_ExecutionSpecification_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_ExecutionSpecification_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_ExecutionSpecification_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_ExecutionSpecification_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    protected HwResourceServiceExecutionSpecification(final ExecutionSpecification elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c4e34f0d-1014-11df-86fe-0014222a9f79");
            HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24944b57-1241-11df-8f55-0014222a9f79");
            HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24944b56-1241-11df-8f55-0014222a9f79");
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
