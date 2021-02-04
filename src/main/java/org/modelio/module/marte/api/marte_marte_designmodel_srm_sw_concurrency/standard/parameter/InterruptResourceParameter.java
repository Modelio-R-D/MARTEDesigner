/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << InterruptResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("66cdb7d4-b905-4dcd-85a9-0693f1472253")
public class InterruptResourceParameter extends SwConcurrentResourceParameter {
    @objid ("1367182c-6df6-4e0f-815d-33ea2106b10a")
    public static final String STEREOTYPE_NAME = "InterruptResource_Parameter";

    @objid ("26187d02-f3db-440f-a190-efc2042cf904")
    public static final String INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE = "InterruptResource_Parameter_isMaskable";

    @objid ("251eb055-d53d-4cf5-8120-02e7861cd9b5")
    public static final String INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE = "InterruptResource_Parameter_kind";

    @objid ("23da6c39-efde-4cdf-929b-365124335ffd")
    public static final String INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE = "InterruptResource_Parameter_maskElements";

    @objid ("3de18a15-d347-4447-9e8a-c4b52dbce8f2")
    public static final String INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Parameter_routineConnectServices";

    @objid ("aaa9cec2-1456-4c8c-a58d-ddeb8bcc3b34")
    public static final String INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Parameter_routineDisconnectServices";

    @objid ("b7d435c5-8c2d-49cd-ad69-49e9eb18e15d")
    public static final String INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE = "InterruptResource_Parameter_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << InterruptResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3b9588f7-e7e0-40a9-8c6d-56fa93d52605")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << InterruptResource_Parameter >> then instantiate a {@link InterruptResourceParameter} proxy.
     * 
     * @return a {@link InterruptResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("61bbab82-cdb5-489e-9fba-2b9306ac3efe")
    public static InterruptResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceParameter.STEREOTYPE_NAME);
        return InterruptResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceParameter} proxy from a {@link Parameter} stereotyped << InterruptResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link InterruptResourceParameter} proxy or <i>null</i>.
     */
    @objid ("6dab0fbf-ef86-4a07-b1d1-1cb6e234472e")
    public static InterruptResourceParameter instantiate(final Parameter obj) {
        return InterruptResourceParameter.canInstantiate(obj) ? new InterruptResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceParameter} proxy from a {@link Parameter} stereotyped << InterruptResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link InterruptResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d8a38729-ccc4-4a4f-95d4-0e151f42f63e")
    public static InterruptResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (InterruptResourceParameter.canInstantiate(obj))
        	return new InterruptResourceParameter(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("632f0d99-2ee1-4960-bfa4-d2a8d7b87ec2")
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
        InterruptResourceParameter other = (InterruptResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("8f44189d-8cd3-455a-a4ea-9ac06c4d5535")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0258555f-18a4-4ad7-9126-1b65df7698e0")
    public String getInterruptResource_Parameter_kind() {
        return this.elt.getTagValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fcaf2484-2ad5-4e30-af52-73708e84f925")
    public List<String> getInterruptResource_Parameter_maskElements() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c0646ff1-e29b-4cf5-84f7-0bdb2c8a79ea")
    public List<String> getInterruptResource_Parameter_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7b5d444c-4c15-49ff-a168-33ea5842a8ec")
    public List<String> getInterruptResource_Parameter_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4a4b41e5-c44b-4e5a-af13-4a2b83d2c3ab")
    public List<String> getInterruptResource_Parameter_vectorElements() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("6ac0044c-cf24-4a4d-a976-a708b3ab2004")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Parameter_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b75d4af7-5f86-41c1-aa04-ecd1316bfce9")
    public boolean isInterruptResource_Parameter_isMaskable() {
        return this.elt.isTagged(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Parameter_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99d68024-66c3-400c-969e-ee68761e3442")
    public void setInterruptResource_Parameter_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45f09d11-1261-4a08-83ec-42c11dc87e65")
    public void setInterruptResource_Parameter_kind(final String value) {
        this.elt.putTagValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67bc86d6-2c4a-4980-a20a-9052d0719253")
    public void setInterruptResource_Parameter_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cddaa400-4cd6-4524-87eb-a0aa012ebef0")
    public void setInterruptResource_Parameter_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("698d9c3d-eb25-4b52-9dc1-4660e2a84983")
    public void setInterruptResource_Parameter_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8063bb1e-c9c4-4a15-aa7f-6c43f04a6dc8")
    public void setInterruptResource_Parameter_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("e1e1ffa6-c703-4465-9add-8c959dca08ae")
    protected InterruptResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("ff572fa1-46d7-40bd-8766-1dca2fa8be3d")
    public static final class MdaTypes {
        @objid ("a349d6ef-e5d9-4493-9111-9d4ec5d1628c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9476d236-c8aa-45c3-9c0b-30067366bd04")
        public static TagType INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT;

        @objid ("7b8e7750-81b2-4a00-a24f-22fdf494b7fc")
        public static TagType INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT;

        @objid ("95f15c6c-352a-43b1-bf4a-5a1cd0de28c0")
        public static TagType INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("ee9968ba-ab58-4a09-9404-b48d0358a0e9")
        public static TagType INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("d5a3fad3-d915-4152-a290-e89b66cbd833")
        public static TagType INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("96333c1b-b7db-4807-9f1c-66c85165f8c0")
        public static TagType INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("d03ff2c2-48da-4e67-943e-4e2fe2c710b4")
        private static Stereotype MDAASSOCDEP;

        @objid ("da128ddc-e129-463d-bda4-752a44bc88be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19d9d8ef-eacb-4ad5-a346-e26179962207")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01bd5ff0-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b82-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b89-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b90-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b97-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9e-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd0-0ccf-11df-8525-001302895b2b");
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
