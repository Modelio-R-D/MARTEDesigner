/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << HwASIC_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8ffb934d-4e81-43b6-b9ab-c398ba494997")
public class HwASICAttribute extends HwComputingResourceAttribute {
    @objid ("0526898a-a55a-4f20-b926-53b07971c6b5")
    public static final String STEREOTYPE_NAME = "HwASIC_Attribute";

    /**
     * Tells whether a {@link HwASICAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwASIC_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8681a29d-531f-4b30-abbc-8ed4b8a3d766")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwASIC_Attribute >> then instantiate a {@link HwASICAttribute} proxy.
     * 
     * @return a {@link HwASICAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("fac33efb-0a42-464b-a3a1-478cf9fc5ff1")
    public static HwASICAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAttribute.STEREOTYPE_NAME);
        return HwASICAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwASICAttribute} proxy from a {@link Attribute} stereotyped << HwASIC_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwASICAttribute} proxy or <i>null</i>.
     */
    @objid ("e12ab3b3-abe3-43dd-b3a6-f4c493885c22")
    public static HwASICAttribute instantiate(final Attribute obj) {
        return HwASICAttribute.canInstantiate(obj) ? new HwASICAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICAttribute} proxy from a {@link Attribute} stereotyped << HwASIC_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwASICAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("122fef58-5b98-4c6b-8f5f-33ee6be7f7d5")
    public static HwASICAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwASICAttribute.canInstantiate(obj))
        	return new HwASICAttribute(obj);
        else
        	throw new IllegalArgumentException("HwASICAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f134f84f-700b-45be-ae1c-938875e62dd4")
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
        HwASICAttribute other = (HwASICAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d120cc66-55f3-4088-8197-72c28cafd29e")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("16604742-2f75-4467-9df6-95e39e4633fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("90482527-3646-4a3c-be29-ccbd20206fa3")
    protected HwASICAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("43306178-dfaf-40a0-a04a-cdbb029f1126")
    public static final class MdaTypes {
        @objid ("114bafa4-a07a-492e-a64c-5a76def6dd38")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("734e3f0e-be02-4196-9b4b-d086cd8405bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("293aa2db-5792-443c-9d34-4fd849be2c7b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("51ca8c13-d878-4fb2-88a4-ca85a90e4b09")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00e93163-0ccf-11df-8525-001302895b2b");
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
