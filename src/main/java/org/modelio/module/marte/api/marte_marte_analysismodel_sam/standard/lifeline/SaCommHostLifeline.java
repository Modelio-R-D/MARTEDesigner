/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaCommHostLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SaCommHost_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaCommHostLifeline extends GaCommHostLifeline {
    public static final String STEREOTYPE_NAME = "SaCommHost_Lifeline";

    public static final String SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE = "SaCommHost_Lifeline_isSched";

    public static final String SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE = "SaCommHost_Lifeline_schSlack";

    /**
     * Tells whether a {@link SaCommHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SaCommHost_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SaCommHost_Lifeline >> then instantiate a {@link SaCommHostLifeline} proxy.
     * 
     * @return a {@link SaCommHostLifeline} proxy on the created {@link Lifeline}.
     */
    public static SaCommHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostLifeline.STEREOTYPE_NAME);
        return SaCommHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostLifeline} proxy from a {@link Lifeline} stereotyped << SaCommHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SaCommHostLifeline} proxy or <i>null</i>.
     */
    public static SaCommHostLifeline instantiate(final Lifeline obj) {
        return SaCommHostLifeline.canInstantiate(obj) ? new SaCommHostLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostLifeline} proxy from a {@link Lifeline} stereotyped << SaCommHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SaCommHostLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaCommHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SaCommHostLifeline.canInstantiate(obj))
        	return new SaCommHostLifeline(obj);
        else
        	throw new IllegalArgumentException("SaCommHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaCommHostLifeline other = (SaCommHostLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommHost_Lifeline_schSlack() {
        return this.elt.getTagValue(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaCommHost_Lifeline_isSched() {
        return this.elt.isTagged(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Lifeline_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Lifeline_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT, value);
    }

    protected SaCommHostLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT;

        public static TagType SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b3c59c4d-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3c59c4e-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3c59c4f-14ad-11df-9d54-0014222a9f79");
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
