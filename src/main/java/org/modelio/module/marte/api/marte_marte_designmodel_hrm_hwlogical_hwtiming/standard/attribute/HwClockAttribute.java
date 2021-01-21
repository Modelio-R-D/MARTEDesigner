/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("e84d9b34-2335-40a8-ac7c-04785e765a1d")
    public static final String STEREOTYPE_NAME = "HwClock_Attribute";

    @objid ("9239b4e4-3806-4dba-94bb-413736daf519")
    public static final String HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwClock_Attribute_frequency";

    /**
     * Tells whether a {@link HwClockAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwClock_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b36db67e-565c-402b-9f66-9bbc773e5a2b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwClock_Attribute >> then instantiate a {@link HwClockAttribute} proxy.
     * 
     * @return a {@link HwClockAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("df679b86-28c8-4a9e-8a48-066d259dda6c")
    public static HwClockAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAttribute.STEREOTYPE_NAME);
        return HwClockAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwClockAttribute} proxy from a {@link Attribute} stereotyped << HwClock_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwClockAttribute} proxy or <i>null</i>.
     */
    @objid ("45c04fef-2b8c-4a2a-a3ec-9451fed9b991")
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
    @objid ("90ff2c1a-7109-4076-934e-6a4eed38686b")
    public static HwClockAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwClockAttribute.canInstantiate(obj))
        	return new HwClockAttribute(obj);
        else
        	throw new IllegalArgumentException("HwClockAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("425e71b3-08fa-49e4-a93e-82bd3cdba774")
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
    @objid ("1a2ea174-61a9-4544-89d3-bc9260c5f479")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60af0409-4731-4831-a0db-d0b7879ff0d8")
    public String getHwClock_Attribute_frequency() {
        return this.elt.getTagValue(HwClockAttribute.MdaTypes.HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("98a8c8f8-4500-4a8d-b78c-91e15d14ef21")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f36468a2-227f-45c9-8483-dcab86b963f0")
    public void setHwClock_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwClockAttribute.MdaTypes.HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("a573fbdf-4ebb-4875-a50c-9bc61717a46c")
    protected HwClockAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fff173da-1647-41e3-9b0e-1b574a5a9ab7")
    public static final class MdaTypes {
        @objid ("35cb2743-058e-4380-8fc1-d609b2cc433b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d40429e5-302c-43b1-8d41-4e763951f25b")
        public static TagType HWCLOCK_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("1f60b6e9-c65a-4e18-b18a-d952cf3e3274")
        private static Stereotype MDAASSOCDEP;

        @objid ("35fb6de6-946f-45c9-8381-a0a6ee57fb9e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c0de45e-1f89-44b6-b368-dfd4351ff4fa")
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
