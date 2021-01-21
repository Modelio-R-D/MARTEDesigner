/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Parameter} with << SharedDataComResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c5a32b02-fc43-4b41-8ac1-ea1473549296")
public class SharedDataComResourceParameter extends SwCommunicationResourceParameter {
    @objid ("633eabd1-d8ef-4c8f-949e-501493d5e741")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Parameter";

    @objid ("484b3938-a251-4f07-8580-706e3772e034")
    public static final String SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE = "SharedDataComResource_Parameter_readServices";

    @objid ("fdb5ecde-b6a3-4dca-bf8a-3fa642ec19f6")
    public static final String SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE = "SharedDataComResource_Parameter_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SharedDataComResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9ba98baa-f8d3-4d9e-8e0f-981571f82906")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SharedDataComResource_Parameter >> then instantiate a {@link SharedDataComResourceParameter} proxy.
     * 
     * @return a {@link SharedDataComResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("0e77e715-68d1-4de3-981d-573fbdf78433")
    public static SharedDataComResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceParameter.STEREOTYPE_NAME);
        return SharedDataComResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceParameter} proxy from a {@link Parameter} stereotyped << SharedDataComResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SharedDataComResourceParameter} proxy or <i>null</i>.
     */
    @objid ("50939d0a-2f8b-477c-8faf-942564b94076")
    public static SharedDataComResourceParameter instantiate(final Parameter obj) {
        return SharedDataComResourceParameter.canInstantiate(obj) ? new SharedDataComResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceParameter} proxy from a {@link Parameter} stereotyped << SharedDataComResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SharedDataComResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9ea571d4-2ab3-449c-869e-b0f964a36104")
    public static SharedDataComResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SharedDataComResourceParameter.canInstantiate(obj))
        	return new SharedDataComResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4b69185c-cea4-4c8d-9603-34b23c30e224")
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
        SharedDataComResourceParameter other = (SharedDataComResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("11ef561a-b885-47ee-b931-f104b1b7afb5")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Parameter_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7f1f099f-8901-4f88-8990-7e8b45d6b658")
    public List<String> getSharedDataComResource_Parameter_readServices() {
        return this.elt.getTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Parameter_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4865dab0-2fe6-4560-aace-96b3e4d59c58")
    public List<String> getSharedDataComResource_Parameter_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("5ed818ed-fae4-4ac0-8dd9-b3d85c2e27b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Parameter_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5635269e-c96a-44ca-b297-7282a205be2e")
    public void setSharedDataComResource_Parameter_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Parameter_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3dad3c0-f3e4-41aa-b697-c30397f17e59")
    public void setSharedDataComResource_Parameter_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("18a46a2b-e95b-4308-9581-a60922bcc801")
    protected SharedDataComResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("38342502-e469-4ae5-bfab-68a5a87d394f")
    public static final class MdaTypes {
        @objid ("9b4087c9-bc13-47d1-878e-ac3c9f5f6db3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de9c1074-7ef0-4ed8-8a70-eed223eb0599")
        public static TagType SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT;

        @objid ("b5935124-0a03-427f-9de4-101a20f4b71a")
        public static TagType SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT;

        @objid ("7fa52832-7617-45f6-ad6c-f57fd224152c")
        private static Stereotype MDAASSOCDEP;

        @objid ("157fce17-b36b-4098-97ed-86f49b4fd524")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5be90dba-2b7d-4dff-8715-27f8535b0406")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "021a5a60-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0221815c-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218163-0ccf-11df-8525-001302895b2b");
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
