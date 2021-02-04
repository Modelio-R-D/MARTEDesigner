/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << HwSupport_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b0a47737-4349-4e02-8053-16ec245946b4")
public class HwSupportAttribute extends HwDeviceAttribute {
    @objid ("cacb881e-8112-4acd-82e5-874ce641abd2")
    public static final String STEREOTYPE_NAME = "HwSupport_Attribute";

    /**
     * Tells whether a {@link HwSupportAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwSupport_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d5e9d41e-25b9-4e1a-81c3-c8ecf94f834a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwSupport_Attribute >> then instantiate a {@link HwSupportAttribute} proxy.
     * 
     * @return a {@link HwSupportAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("dffc1e15-2fad-468c-85c0-ac6fd940e091")
    public static HwSupportAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAttribute.STEREOTYPE_NAME);
        return HwSupportAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportAttribute} proxy from a {@link Attribute} stereotyped << HwSupport_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwSupportAttribute} proxy or <i>null</i>.
     */
    @objid ("5bd57a7b-7b76-4d2b-bd51-fe502e5dcecd")
    public static HwSupportAttribute instantiate(final Attribute obj) {
        return HwSupportAttribute.canInstantiate(obj) ? new HwSupportAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportAttribute} proxy from a {@link Attribute} stereotyped << HwSupport_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwSupportAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("653cff4d-3d7b-43a4-bc55-715109e93496")
    public static HwSupportAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwSupportAttribute.canInstantiate(obj))
        	return new HwSupportAttribute(obj);
        else
        	throw new IllegalArgumentException("HwSupportAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("92b929bd-869e-4693-ad0c-1d21699c67da")
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
        HwSupportAttribute other = (HwSupportAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("ad0170ab-d9aa-49fc-9fbc-494baacfe51b")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("cc473307-c805-4ac6-9e1c-6d13931c8646")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("21c4486f-d0fe-4ca0-b521-c03e935cdfd1")
    protected HwSupportAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("7946b590-3be7-4f93-b4b3-0f57f0d9801b")
    public static final class MdaTypes {
        @objid ("73d01a6c-0a69-4cc0-b87c-5b7dbc50d3d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b065e7b-086a-438c-93d8-581aeb505dd2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a563f376-d89f-4de7-8eb8-4195de13bc48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f390278f-285e-4574-a027-440771bc96a7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "013ca299-0ccf-11df-8525-001302895b2b");
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
