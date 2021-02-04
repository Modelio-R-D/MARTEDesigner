/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << TimingResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("612173a4-0092-4de0-af29-3607e0eb3efa")
public class TimingResourceAttribute extends ResourceAttribute {
    @objid ("c5229112-85ff-492d-95fa-f4bf1cab4155")
    public static final String STEREOTYPE_NAME = "TimingResource_Attribute";

    /**
     * Tells whether a {@link TimingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TimingResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a0458eee-340a-4250-86e0-dbfc15668b28")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TimingResource_Attribute >> then instantiate a {@link TimingResourceAttribute} proxy.
     * 
     * @return a {@link TimingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("dc6154c8-5bc6-423c-8fba-442a6d97c99f")
    public static TimingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAttribute.STEREOTYPE_NAME);
        return TimingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceAttribute} proxy from a {@link Attribute} stereotyped << TimingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TimingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("606568a1-4c55-4ee2-8ea4-30a3c31135d2")
    public static TimingResourceAttribute instantiate(final Attribute obj) {
        return TimingResourceAttribute.canInstantiate(obj) ? new TimingResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceAttribute} proxy from a {@link Attribute} stereotyped << TimingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TimingResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1b1444dd-e530-4d0b-9b62-2e413494454a")
    public static TimingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TimingResourceAttribute.canInstantiate(obj))
        	return new TimingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("TimingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7850d58c-4cf9-4560-9453-5315e64690cd")
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
        TimingResourceAttribute other = (TimingResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("88f93da0-0b36-4ff3-b087-a2d92d30f2f0")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("79e5c9d4-6142-4a50-b529-961d34f105de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a49dd667-56c3-4ce8-a2b9-cef7e6abd995")
    protected TimingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("c9d217a0-1384-4efd-9328-daaaef14528b")
    public static final class MdaTypes {
        @objid ("28aea271-acfb-4fa1-b5fa-7b0ff04e62d2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0c650af-9650-44d4-afa4-40329e5afc9b")
        private static Stereotype MDAASSOCDEP;

        @objid ("127dcf7b-1604-418d-88eb-f7d94da1eac3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6f91c5fd-128f-4db5-ab42-2c1239ddef49")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009ce722-0ccf-11df-8525-001302895b2b");
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
