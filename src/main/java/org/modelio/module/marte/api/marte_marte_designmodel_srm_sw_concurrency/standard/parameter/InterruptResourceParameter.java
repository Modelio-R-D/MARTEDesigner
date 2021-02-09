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
public class InterruptResourceParameter extends SwConcurrentResourceParameter {
    public static final String STEREOTYPE_NAME = "InterruptResource_Parameter";

    public static final String INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE = "InterruptResource_Parameter_isMaskable";

    public static final String INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE = "InterruptResource_Parameter_kind";

    public static final String INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE = "InterruptResource_Parameter_maskElements";

    public static final String INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Parameter_routineConnectServices";

    public static final String INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Parameter_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE = "InterruptResource_Parameter_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << InterruptResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << InterruptResource_Parameter >> then instantiate a {@link InterruptResourceParameter} proxy.
     * 
     * @return a {@link InterruptResourceParameter} proxy on the created {@link Parameter}.
     */
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
    public static InterruptResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (InterruptResourceParameter.canInstantiate(obj))
        	return new InterruptResourceParameter(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        InterruptResourceParameter other = (InterruptResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_Parameter_kind() {
        return this.elt.getTagValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Parameter_maskElements() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Parameter_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Parameter_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Parameter_vectorElements() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Parameter_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_Parameter_isMaskable() {
        return this.elt.isTagged(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Parameter_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setInterruptResource_Parameter_kind(final String value) {
        this.elt.putTagValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Parameter_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Parameter_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Parameter_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Parameter_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
