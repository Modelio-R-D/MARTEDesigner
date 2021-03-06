/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaCommHostAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SaCommHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaCommHostAttribute extends GaCommHostAttribute {
    public static final String STEREOTYPE_NAME = "SaCommHost_Attribute";

    public static final String SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE = "SaCommHost_Attribute_isSched";

    public static final String SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE = "SaCommHost_Attribute_schSlack";

    /**
     * Tells whether a {@link SaCommHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaCommHost_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaCommHost_Attribute >> then instantiate a {@link SaCommHostAttribute} proxy.
     * 
     * @return a {@link SaCommHostAttribute} proxy on the created {@link Attribute}.
     */
    public static SaCommHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAttribute.STEREOTYPE_NAME);
        return SaCommHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostAttribute} proxy from a {@link Attribute} stereotyped << SaCommHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SaCommHostAttribute} proxy or <i>null</i>.
     */
    public static SaCommHostAttribute instantiate(final Attribute obj) {
        return SaCommHostAttribute.canInstantiate(obj) ? new SaCommHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostAttribute} proxy from a {@link Attribute} stereotyped << SaCommHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SaCommHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaCommHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaCommHostAttribute.canInstantiate(obj))
        	return new SaCommHostAttribute(obj);
        else
        	throw new IllegalArgumentException("SaCommHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaCommHostAttribute other = (SaCommHostAttribute) obj;
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
     * Getter for string property 'SaCommHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommHost_Attribute_schSlack() {
        return this.elt.getTagValue(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaCommHost_Attribute_isSched() {
        return this.elt.isTagged(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Attribute_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Attribute_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT, value);
    }

    protected SaCommHostAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT;

        public static TagType SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9247-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c924e-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9255-0ccf-11df-8525-001302895b2b");
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
