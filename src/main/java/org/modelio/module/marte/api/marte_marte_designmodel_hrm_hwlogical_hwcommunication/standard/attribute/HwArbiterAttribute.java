/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwArbiter_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwArbiterAttribute extends HwCommunicationResourceAttribute {
    public static final String STEREOTYPE_NAME = "HwArbiter_Attribute";

    public static final String HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Attribute_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwArbiter_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwArbiter_Attribute >> then instantiate a {@link HwArbiterAttribute} proxy.
     * 
     * @return a {@link HwArbiterAttribute} proxy on the created {@link Attribute}.
     */
    public static HwArbiterAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAttribute.STEREOTYPE_NAME);
        return HwArbiterAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterAttribute} proxy from a {@link Attribute} stereotyped << HwArbiter_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwArbiterAttribute} proxy or <i>null</i>.
     */
    public static HwArbiterAttribute instantiate(final Attribute obj) {
        return HwArbiterAttribute.canInstantiate(obj) ? new HwArbiterAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterAttribute} proxy from a {@link Attribute} stereotyped << HwArbiter_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwArbiterAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwArbiterAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwArbiterAttribute.canInstantiate(obj))
        	return new HwArbiterAttribute(obj);
        else
        	throw new IllegalArgumentException("HwArbiterAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwArbiterAttribute other = (HwArbiterAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Attribute_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwArbiter_Attribute_controlledMedias() {
        return this.elt.getTagValues(HwArbiterAttribute.MdaTypes.HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Attribute_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwArbiter_Attribute_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterAttribute.MdaTypes.HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    protected HwArbiterAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036ae8-0ccf-11df-8525-001302895b2b");
            HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01036aef-0ccf-11df-8525-001302895b2b");
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
