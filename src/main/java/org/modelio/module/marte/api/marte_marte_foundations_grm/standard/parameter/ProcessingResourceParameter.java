/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("36e3464d-4037-4d43-93d1-c6b21e1bae2a")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Parameter";

    @objid ("fc29ccb8-4a6c-472e-93a4-e7285f946d1f")
    public static final String PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Parameter_mainScheduler";

    @objid ("41c4e440-ad23-447c-a11e-2e4d13be7254")
    public static final String PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Parameter_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << ProcessingResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4db307d2-f22a-4579-953b-d305a1875d91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << ProcessingResource_Parameter >> then instantiate a {@link ProcessingResourceParameter} proxy.
     * 
     * @return a {@link ProcessingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("ea4b233f-a696-4656-be67-970f9a412942")
    public static ProcessingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceParameter.STEREOTYPE_NAME);
        return ProcessingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceParameter} proxy from a {@link Parameter} stereotyped << ProcessingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ProcessingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("608d72ba-09b6-4e1d-8f09-e6bab25f2235")
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
    @objid ("b7182d34-feff-459d-8883-b1535aa14d0a")
    public static ProcessingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ProcessingResourceParameter.canInstantiate(obj))
        	return new ProcessingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("442058b8-2193-4959-914e-0eda20b5c953")
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
    @objid ("5431845b-0542-4f1a-b66e-506fec228fd8")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95f7ca74-5d30-4e3d-aef6-2c02bdfdf5b1")
    public String getProcessingResource_Parameter_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7fad37a-ae61-4557-b9aa-583c6b36f417")
    public String getProcessingResource_Parameter_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("a0748749-376e-4ec5-b940-f347b3ec69f1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("903f8a5d-5b09-47d9-9fe7-cd59a295e983")
    public void setProcessingResource_Parameter_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("693a358f-1d4f-4acd-aac4-24b88162e7c0")
    public void setProcessingResource_Parameter_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceParameter.MdaTypes.PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("1e37fcf2-41e7-4c68-9d6a-e4c120107346")
    protected ProcessingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("7698b1f6-f9c0-440d-aa46-1368accf273b")
    public static final class MdaTypes {
        @objid ("a93953f9-b470-48bc-b1da-b78da4e00690")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c3bd4193-d063-49b2-83d3-d4bc28f16ed5")
        public static TagType PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("1fcc6324-2c06-49ff-aeef-f7fe658af9a0")
        public static TagType PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("52b48425-0039-4284-a6d3-3eae0269dafa")
        private static Stereotype MDAASSOCDEP;

        @objid ("202bca31-46a6-49f3-8ea1-600cc922d4fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19db7cdf-abf1-4fc0-b18b-d2ce970fb74e")
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
