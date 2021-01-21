/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("768e5da0-41ea-4074-ae9c-6a1234bcd444")
    public static final String STEREOTYPE_NAME = "HwASIC_Attribute";

    /**
     * Tells whether a {@link HwASICAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwASIC_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ce07173c-6925-4f14-b540-a95d860c195e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwASIC_Attribute >> then instantiate a {@link HwASICAttribute} proxy.
     * 
     * @return a {@link HwASICAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("c4f25269-4cc3-456d-89aa-f6edf644a0f6")
    public static HwASICAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAttribute.STEREOTYPE_NAME);
        return HwASICAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwASICAttribute} proxy from a {@link Attribute} stereotyped << HwASIC_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwASICAttribute} proxy or <i>null</i>.
     */
    @objid ("599e825a-b9d1-42e4-9d0b-65d4ff9eb554")
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
    @objid ("e97d7432-5b22-4ba6-8a2f-8f2ead3b0aa6")
    public static HwASICAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwASICAttribute.canInstantiate(obj))
        	return new HwASICAttribute(obj);
        else
        	throw new IllegalArgumentException("HwASICAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a95114c8-77e1-43e8-b36d-771010667b36")
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
    @objid ("c18ccb75-ae96-4c06-8399-7dd835366dad")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("bd36c20a-ee4b-4c75-8239-2e49add17c01")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4d441dad-77e3-4688-8172-0c5b43dac727")
    protected HwASICAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("43306178-dfaf-40a0-a04a-cdbb029f1126")
    public static final class MdaTypes {
        @objid ("2bb39435-53d2-4d62-9629-b0eba50180b2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f22779c7-7bb6-4d42-bb17-c689c4f87697")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c2bdb10-bfb1-4aa8-afb5-ec23fa169147")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0d83bb59-61c0-4305-b9da-ca752b86ddd5")
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
