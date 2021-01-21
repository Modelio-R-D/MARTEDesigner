/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("962a3163-a80a-4742-a2ba-e4e8ebea8e9d")
    public static final String STEREOTYPE_NAME = "TimingResource_Attribute";

    /**
     * Tells whether a {@link TimingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TimingResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e2552c54-1470-41ab-a621-b5ee5e2c1bbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TimingResource_Attribute >> then instantiate a {@link TimingResourceAttribute} proxy.
     * 
     * @return a {@link TimingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("7b8ce16e-f6f1-491c-ba0c-0c5be6e32b64")
    public static TimingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAttribute.STEREOTYPE_NAME);
        return TimingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceAttribute} proxy from a {@link Attribute} stereotyped << TimingResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TimingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("5e800bd6-8eb5-4ed6-862d-3189ef998428")
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
    @objid ("3a381542-9def-4cdf-ba13-21e90016e5a9")
    public static TimingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TimingResourceAttribute.canInstantiate(obj))
        	return new TimingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("TimingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bb94e6a0-34eb-4b5e-b08a-c454d8998d4d")
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
    @objid ("ffebef75-9874-49fa-9713-2ac0e965147f")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("c426a851-69f8-455e-aae2-e4c08b9e161d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7a474f10-7499-4c45-bee1-c375d6e4b6df")
    protected TimingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("c9d217a0-1384-4efd-9328-daaaef14528b")
    public static final class MdaTypes {
        @objid ("4ea2f495-1354-49d1-9bd2-95c3e909c231")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7e3eaef-a4bc-4976-ab41-4e76b938b131")
        private static Stereotype MDAASSOCDEP;

        @objid ("4ab3d002-df75-4843-b219-21bfea551b96")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53a66f92-4b80-44aa-b3ad-e12ba475cb84")
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
