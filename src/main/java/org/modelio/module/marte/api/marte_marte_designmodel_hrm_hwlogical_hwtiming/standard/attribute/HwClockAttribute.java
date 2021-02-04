/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwClock_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a451bf81-d5f7-49eb-a20c-c17958f70ce7")
public class HwClockAttribute extends HwTimingResourceAttribute {
    @objid ("7f191d6a-5342-4284-93a0-bcec8abe0dcf")
    public static final String STEREOTYPE_NAME = "HwClock_Attribute";

    @objid ("50204a6d-218b-48e8-b6aa-2116e045a561")
    public static final String HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwClock_Attribute_frequency";

    /**
     * Tells whether a {@link HwClockAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwClock_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("986be1e0-c43c-4498-847d-1fc83c37414d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwClock_Attribute >> then instantiate a {@link HwClockAttribute} proxy.
     * 
     * @return a {@link HwClockAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("76327e52-6b5f-4918-a6af-7bed59348625")
    public static HwClockAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAttribute.STEREOTYPE_NAME);
        return HwClockAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwClockAttribute} proxy from a {@link Attribute} stereotyped << HwClock_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwClockAttribute} proxy or <i>null</i>.
     */
    @objid ("ac95fd6d-223e-4a18-a95a-b12d6a64b191")
    public static HwClockAttribute instantiate(final Attribute obj) {
        return HwClockAttribute.canInstantiate(obj) ? new HwClockAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockAttribute} proxy from a {@link Attribute} stereotyped << HwClock_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwClockAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("48e42a03-4401-42ff-9bf1-195822be907a")
    public static HwClockAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwClockAttribute.canInstantiate(obj))
        	return new HwClockAttribute(obj);
        else
        	throw new IllegalArgumentException("HwClockAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9f4a6a4b-f21c-45bf-b31f-34122be01a26")
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
        HwClockAttribute other = (HwClockAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("06af1543-5c90-433c-9425-e54d0987545f")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c388ca43-8069-4894-a2eb-fcd3f8c9a64d")
    public String getHwClock_Attribute_frequency() {
        return this.elt.getTagValue(HwClockAttribute.MdaTypes.HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("e0d8ed8a-e269-41f5-ad42-da7f597cc9a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49f40d28-1df1-459c-b521-894acf8d3532")
    public void setHwClock_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwClockAttribute.MdaTypes.HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("7a1f6c17-76e9-4e81-b045-5bab3b9560b9")
    protected HwClockAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fff173da-1647-41e3-9b0e-1b574a5a9ab7")
    public static final class MdaTypes {
        @objid ("830bf452-4e6c-483d-a05d-6b077f3f0603")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ae1e3ef-02a1-4843-be8b-4b9211791d8e")
        public static TagType HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("67f10281-b52d-40c3-8bcd-5ab427498d93")
        private static Stereotype MDAASSOCDEP;

        @objid ("f2dac92c-06be-42fc-aac8-e41411f490e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("830c8ccb-1ba4-4917-b254-43a273c8f571")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01272db7-0ccf-11df-8525-001302895b2b");
            HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f4b4c162-123c-11df-8f55-0014222a9f79");
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
