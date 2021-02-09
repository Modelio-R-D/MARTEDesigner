/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.GrServiceOperation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << HwResourceService_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwResourceServiceOperation extends GrServiceOperation {
    public static final String STEREOTYPE_NAME = "HwResourceService_Operation";

    public static final String HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE = "HwResourceService_Operation_consumption";

    public static final String HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE = "HwResourceService_Operation_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << HwResourceService_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << HwResourceService_Operation >> then instantiate a {@link HwResourceServiceOperation} proxy.
     * 
     * @return a {@link HwResourceServiceOperation} proxy on the created {@link Operation}.
     */
    public static HwResourceServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceOperation.STEREOTYPE_NAME);
        return HwResourceServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceOperation} proxy from a {@link Operation} stereotyped << HwResourceService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link HwResourceServiceOperation} proxy or <i>null</i>.
     */
    public static HwResourceServiceOperation instantiate(final Operation obj) {
        return HwResourceServiceOperation.canInstantiate(obj) ? new HwResourceServiceOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceOperation} proxy from a {@link Operation} stereotyped << HwResourceService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link HwResourceServiceOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwResourceServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (HwResourceServiceOperation.canInstantiate(obj))
        	return new HwResourceServiceOperation(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwResourceServiceOperation other = (HwResourceServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Operation_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_Operation_consumption() {
        return this.elt.getTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Operation_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_Operation_dissipation() {
        return this.elt.getTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Operation_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_Operation_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Operation_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_Operation_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    protected HwResourceServiceOperation(final Operation elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b9eab3b5-1014-11df-86fe-0014222a9f79");
            HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "23894157-1241-11df-8f55-0014222a9f79");
            HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "23894156-1241-11df-8f55-0014222a9f79");
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
