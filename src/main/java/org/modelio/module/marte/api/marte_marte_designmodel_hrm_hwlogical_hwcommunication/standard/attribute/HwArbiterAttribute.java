/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
@objid ("3dc99712-16db-4a54-898a-4e2cf7c8672d")
public class HwArbiterAttribute extends HwCommunicationResourceAttribute {
    @objid ("33a0b9cf-dce7-4c42-9ba1-a5dd5bec49f7")
    public static final String STEREOTYPE_NAME = "HwArbiter_Attribute";

    @objid ("45f1ebc3-d937-4036-8435-e19d4365950a")
    public static final String HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Attribute_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwArbiter_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3119a535-064c-4300-9ee4-98121507e08d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwArbiter_Attribute >> then instantiate a {@link HwArbiterAttribute} proxy.
     * 
     * @return a {@link HwArbiterAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("f07e75c1-dd25-47b9-bb82-13f3d175ca78")
    public static HwArbiterAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAttribute.STEREOTYPE_NAME);
        return HwArbiterAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterAttribute} proxy from a {@link Attribute} stereotyped << HwArbiter_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwArbiterAttribute} proxy or <i>null</i>.
     */
    @objid ("a456fea7-354a-41a4-92d2-a8f51a355e41")
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
    @objid ("86368eee-5ccf-4d44-bfb3-8e109fe6940e")
    public static HwArbiterAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwArbiterAttribute.canInstantiate(obj))
        	return new HwArbiterAttribute(obj);
        else
        	throw new IllegalArgumentException("HwArbiterAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("182cfcd4-cbda-455b-9391-1b776e058379")
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
    @objid ("90653aea-b365-466b-9e3f-8ee834e37afb")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Attribute_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("515a64ec-ac4e-4d70-9c3b-fa7f916769b4")
    public List<String> getHwArbiter_Attribute_controlledMedias() {
        return this.elt.getTagValues(HwArbiterAttribute.MdaTypes.HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("adb0fb71-0094-4d4a-a6b3-0fb91a29daba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Attribute_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45d44b5a-97be-4c28-9851-e220eafdc784")
    public void setHwArbiter_Attribute_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterAttribute.MdaTypes.HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("6d03d1e4-c51e-49bf-9ec0-2b476e2395e1")
    protected HwArbiterAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("e2a18f02-dd7c-4565-90c9-bbefed35af01")
    public static final class MdaTypes {
        @objid ("bf742289-d725-4505-994f-edca9adc099a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ec7e4af-c9f5-48d3-8735-eba7a1d4f58d")
        public static TagType HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("c5fd5a47-e606-403f-9826-2e7eb950b909")
        private static Stereotype MDAASSOCDEP;

        @objid ("415d1fa2-455c-40a0-aa9f-5a138d8a8b5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48b6fab2-d1d3-472e-b605-0f84882d18f3")
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
