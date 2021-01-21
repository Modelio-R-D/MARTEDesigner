/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.operation;

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
@objid ("1bdc2030-3231-4cbc-b1a1-3597712e8bde")
public class HwResourceServiceOperation extends GrServiceOperation {
    @objid ("0bb37969-22d7-42d5-856c-5f1d7c273fe0")
    public static final String STEREOTYPE_NAME = "HwResourceService_Operation";

    @objid ("9b4061c6-9657-4d8a-9b14-b685bf25480a")
    public static final String HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE = "HwResourceService_Operation_consumption";

    @objid ("4073595a-d898-4185-830d-b75b8b3b2949")
    public static final String HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE = "HwResourceService_Operation_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << HwResourceService_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6a590541-8ee7-4640-936c-419bee5baa28")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << HwResourceService_Operation >> then instantiate a {@link HwResourceServiceOperation} proxy.
     * 
     * @return a {@link HwResourceServiceOperation} proxy on the created {@link Operation}.
     */
    @objid ("7d847258-b620-4063-a519-667d32dc1b66")
    public static HwResourceServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceOperation.STEREOTYPE_NAME);
        return HwResourceServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceOperation} proxy from a {@link Operation} stereotyped << HwResourceService_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link HwResourceServiceOperation} proxy or <i>null</i>.
     */
    @objid ("978fe843-6eb2-426c-8311-247b3298ac6f")
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
    @objid ("d0354882-b8c8-4ae8-9407-e8b6ae6a478b")
    public static HwResourceServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (HwResourceServiceOperation.canInstantiate(obj))
        	return new HwResourceServiceOperation(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd8f2171-3437-47fe-b8d9-b91465313665")
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
    @objid ("9b981ef8-fc9d-4009-b868-3e41bc2a8f40")
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Operation_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93014662-1526-434b-9e18-2de3dccae381")
    public String getHwResourceService_Operation_consumption() {
        return this.elt.getTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Operation_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45aa0248-c88f-44e6-849e-851caa063096")
    public String getHwResourceService_Operation_dissipation() {
        return this.elt.getTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("14927c81-3f40-4df6-8527-e815a1192ce6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Operation_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87f4b71b-bfc3-49dd-b726-db141a564e63")
    public void setHwResourceService_Operation_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Operation_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2766d5c-d67e-4222-a5d4-f6830de9c732")
    public void setHwResourceService_Operation_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceOperation.MdaTypes.HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("e566884a-54e9-4f90-bf27-74b1de643c18")
    protected HwResourceServiceOperation(final Operation elt) {
        super(elt);
    }

    @objid ("3ced78e2-76b0-4b3d-8061-1f597dfb0232")
    public static final class MdaTypes {
        @objid ("776bca3c-a035-4061-80cb-9a37c7d1b78d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("473c551c-c399-47ca-9c9c-d68cc2ce3a45")
        public static TagType HWRESOURCESERVICE_OPERATION_CONSUMPTION_TAGTYPE_ELT;

        @objid ("7316afb5-8e93-45c7-8e24-3347e64242c7")
        public static TagType HWRESOURCESERVICE_OPERATION_DISSIPATION_TAGTYPE_ELT;

        @objid ("10414e43-4975-414d-ad6e-644c6c0c507e")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b9f18b3-34da-43e1-9054-ad6d062dbbe2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ea1b7ef-0c7d-4798-aa4d-30b15b277651")
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
