/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.executionspecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("27bab3ac-805f-42b7-af3e-90d49991e165")
public class HwResourceServiceExecutionSpecification extends GrServiceExecutionSpecification {
    @objid ("efc6ef5b-417b-42cb-af0b-8d5bd47c4d18")
    public static final String STEREOTYPE_NAME = "HwResourceService_ExecutionSpecification";

    @objid ("6fbf9e92-4fba-4764-9c3b-1f53124ccb1f")
    public static final String HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE = "HwResourceService_ExecutionSpecification_consumption";

    @objid ("bcb0a09f-08e9-4966-8d05-5b470106b4aa")
    public static final String HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE = "HwResourceService_ExecutionSpecification_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("32f3afb4-da29-4771-b528-469008079e06")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >> then instantiate a {@link HwResourceServiceExecutionSpecification} proxy.
     * 
     * @return a {@link HwResourceServiceExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    @objid ("3a72b402-c81d-49ce-93f1-a6aa7a7f1314")
    public static HwResourceServiceExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceExecutionSpecification.STEREOTYPE_NAME);
        return HwResourceServiceExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << HwResourceService_ExecutionSpecification >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link HwResourceServiceExecutionSpecification} proxy or <i>null</i>.
     */
    @objid ("f9344a6d-f893-4095-903a-4590ba9be030")
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
    @objid ("e337afb2-75f1-4e88-9d13-52fd3a8f75b1")
    public static HwResourceServiceExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (HwResourceServiceExecutionSpecification.canInstantiate(obj))
        	return new HwResourceServiceExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a4e7b8e-3762-4357-8a0a-b245ec260629")
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
    @objid ("7378bbdd-977b-4f03-b492-932cf5dd4415")
    @Override
    public ExecutionSpecification getElement() {
        return (ExecutionSpecification)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_ExecutionSpecification_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e46c5e3-9185-425b-97e9-c79e3139679a")
    public String getHwResourceService_ExecutionSpecification_consumption() {
        return this.elt.getTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_ExecutionSpecification_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d54278e2-9f44-43bc-a84c-d84ef172481f")
    public String getHwResourceService_ExecutionSpecification_dissipation() {
        return this.elt.getTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("8526bfa8-375b-4060-8c15-4dbd5421d44a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_ExecutionSpecification_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a69ed03-494f-42fd-83a3-c7fab2a3d623")
    public void setHwResourceService_ExecutionSpecification_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_ExecutionSpecification_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("579c151e-9cff-41ef-9338-3a5930048bb9")
    public void setHwResourceService_ExecutionSpecification_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceExecutionSpecification.MdaTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("bef84bfb-de06-4194-a995-cefacd38f3d3")
    protected HwResourceServiceExecutionSpecification(final ExecutionSpecification elt) {
        super(elt);
    }

    @objid ("e40d8994-640c-4251-b6be-8162a2bac967")
    public static final class MdaTypes {
        @objid ("bd67575f-d312-45b3-aa01-4cb0e9c63304")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aee5b532-8218-4a4d-9f26-1dbea146293a")
        public static TagType HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION_TAGTYPE_ELT;

        @objid ("3599be6d-cfba-4d3d-8fa8-03dd6cd6fbe7")
        public static TagType HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION_TAGTYPE_ELT;

        @objid ("5376b977-b3ea-4ba3-95aa-131d182f3b57")
        private static Stereotype MDAASSOCDEP;

        @objid ("98bcb250-c56a-48fe-99c2-224ee75736c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("722997f4-9579-4bbd-ae52-151e36cc3296")
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
