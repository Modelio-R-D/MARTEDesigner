/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.TimerResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwTimerResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bd9e2c1a-b440-4005-b00a-dead3caf7d43")
public class SwTimerResourceAttribute extends TimerResourceAttribute {
    @objid ("a9346976-f1b9-4a94-8e00-088ca8a0efa3")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Attribute";

    /**
     * Tells whether a {@link SwTimerResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwTimerResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f9cd3be3-011e-47c6-abe6-b92e2e51e88c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwTimerResource_Attribute >> then instantiate a {@link SwTimerResourceAttribute} proxy.
     * 
     * @return a {@link SwTimerResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("3f0c732b-9b21-459c-9d4c-1a0d5562e010")
    public static SwTimerResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAttribute.STEREOTYPE_NAME);
        return SwTimerResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAttribute} proxy from a {@link Attribute} stereotyped << SwTimerResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwTimerResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("906d48f9-ddc3-44fd-950b-a14bc8805e51")
    public static SwTimerResourceAttribute instantiate(final Attribute obj) {
        return SwTimerResourceAttribute.canInstantiate(obj) ? new SwTimerResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAttribute} proxy from a {@link Attribute} stereotyped << SwTimerResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwTimerResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5a4601f6-c693-44ce-a1bc-8c94880b2b0e")
    public static SwTimerResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwTimerResourceAttribute.canInstantiate(obj))
        	return new SwTimerResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d82169fe-5ace-4dbc-a4a9-178e2dcb937e")
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
        SwTimerResourceAttribute other = (SwTimerResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("2b3a32e5-620e-4a00-aae1-50bb242e50e9")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("a3da95a6-4274-4935-a19a-4d6a9874e5c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b1f50c4d-3627-490a-b6f9-8f3f9f028ef4")
    protected SwTimerResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("850d8011-9ee8-4b1b-bb2d-6aa8ed285e8d")
    public static final class MdaTypes {
        @objid ("43cdf275-d541-4b2b-9e15-c53481d65f0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9da298e-e96c-46af-8f59-1fe0466c2ea8")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b4ff6c0-2a60-443e-8812-c62d4c99af40")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e31bf77-a602-417e-b262-b0d66b663013")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01dec061-0ccf-11df-8525-001302895b2b");
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
