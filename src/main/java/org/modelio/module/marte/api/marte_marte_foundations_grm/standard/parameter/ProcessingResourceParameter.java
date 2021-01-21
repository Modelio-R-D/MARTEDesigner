/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << ProcessingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d938e5b9-4e9f-498c-af50-d83c7e95d6c9")
public class ProcessingResourceParameter extends ResourceParameter {
    @objid ("b96ea662-8c5e-4765-b142-beef7f53314b")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Parameter";

    @objid ("1c6091aa-229a-4ce0-b488-aa678d59b514")
    public static final String PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Parameter_mainScheduler";

    @objid ("b1b53cb8-6f08-4a40-ba1b-9baefc2c00c3")
    public static final String PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Parameter_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << ProcessingResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("becb3613-d8f6-45db-b66b-4d4e6f3df19c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << ProcessingResource_Parameter >> then instantiate a {@link ProcessingResourceParameter} proxy.
     * 
     * @return a {@link ProcessingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("685a5910-6146-4a38-9f3a-a2be583de227")
    public static ProcessingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceParameter.STEREOTYPE_NAME);
        return ProcessingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceParameter} proxy from a {@link Parameter} stereotyped << ProcessingResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ProcessingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("f841bb1f-2281-4fff-9bcf-f10b830480a9")
    public static ProcessingResourceParameter instantiate(final Parameter obj) {
        return ProcessingResourceParameter.canInstantiate(obj) ? new ProcessingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceParameter} proxy from a {@link Parameter} stereotyped << ProcessingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link ProcessingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e42371c0-1181-4cd8-90d3-e79a2cc2c630")
    public static ProcessingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ProcessingResourceParameter.canInstantiate(obj))
        	return new ProcessingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("489bc66e-f26a-4c44-8509-da2d47edb098")
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
        ProcessingResourceParameter other = (ProcessingResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("fed45050-85ff-4857-80e4-0f716e7a4e64")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35c61170-5caf-4b6b-81bd-f0f309d7029e")
    public String getProcessingResource_Parameter_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2250f536-dd22-459d-bcea-da318463a687")
    public String getProcessingResource_Parameter_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("e5ca15a9-2f75-4119-86eb-16c392200a18")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a420f46a-1169-4132-96b3-72ac05bc43cd")
    public void setProcessingResource_Parameter_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("711b7d37-539c-4fa1-a1cb-b02e4bb5a8da")
    public void setProcessingResource_Parameter_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("701b41db-e37f-437c-88a2-bf066a790845")
    protected ProcessingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("7698b1f6-f9c0-440d-aa46-1368accf273b")
    public static final class MdaTypes {
        @objid ("b594ae1e-9806-4d55-ab67-0650224dd43f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1a78ac3-179d-4fea-9dec-d044e39c235e")
        public static TagType PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("241ea15a-1fc9-4e12-bf51-51f465b87f6c")
        public static TagType PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("6f9e3ba5-89df-4bb1-bca8-df11bb3b4a37")
        private static Stereotype MDAASSOCDEP;

        @objid ("e911dd66-a172-4d54-9801-d64de0ae8933")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cb3424dc-8c29-4cc6-9431-f9d25b80613b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0090fb99-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935ddc-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de3-0ccf-11df-8525-001302895b2b");
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
