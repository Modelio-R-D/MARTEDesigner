/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("bcb3342d-9c7e-4ba9-987e-950086fc2732")
public class SaCommHostLifeline extends GaCommHostLifeline {
    @objid ("d192335c-26a8-468e-b787-e8a60c9974c3")
    public static final String STEREOTYPE_NAME = "SaCommHost_Lifeline";

    @objid ("e32016f7-2208-4a91-a273-1f46a2501076")
    public static final String SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE = "SaCommHost_Lifeline_isSched";

    @objid ("1bcbb15d-b542-4d0f-bc25-ec54503712e5")
    public static final String SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE = "SaCommHost_Lifeline_schSlack";

    /**
     * Tells whether a {@link SaCommHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SaCommHost_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("02690c37-a8e0-4b76-913b-b1e811ac2c20")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SaCommHost_Lifeline >> then instantiate a {@link SaCommHostLifeline} proxy.
     * 
     * @return a {@link SaCommHostLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("ef91035d-e754-4861-9f7d-71d5395a5d0f")
    public static SaCommHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostLifeline.STEREOTYPE_NAME);
        return SaCommHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostLifeline} proxy from a {@link Lifeline} stereotyped << SaCommHost_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SaCommHostLifeline} proxy or <i>null</i>.
     */
    @objid ("500cb281-51ce-4c13-8d28-15d575eecafb")
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
    @objid ("5d7f4e57-316a-4929-bcb6-6ba916e41efc")
    public static SaCommHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SaCommHostLifeline.canInstantiate(obj))
        	return new SaCommHostLifeline(obj);
        else
        	throw new IllegalArgumentException("SaCommHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c4aae48c-3253-45ea-bdc3-25b8b336b6d3")
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
    @objid ("58e65d11-6b78-4868-abba-a43a06b635f0")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb6a26fc-2543-4ab4-8871-cae970befd3e")
    public String getSaCommHost_Lifeline_schSlack() {
        return this.elt.getTagValue(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("125f780e-2027-4f10-b20d-c0386b9541aa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97eb417d-53c0-43eb-8a0f-1c37ffee7589")
    public boolean isSaCommHost_Lifeline_isSched() {
        return this.elt.isTagged(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14d30a93-5180-4692-be9b-593df87fa188")
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
    @objid ("4cba9ef5-afa3-41bc-92ca-586aa397be74")
    public void setSaCommHost_Lifeline_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostLifeline.MdaTypes.SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("63b8da5a-a912-4bf3-9f6b-dd6d15e96ea7")
    protected SaCommHostLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("cbd5ef2e-9de7-4ff6-8e69-12d254cc66ef")
    public static final class MdaTypes {
        @objid ("14193b42-4a6e-42ff-acc5-40b59ade2da7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("639cced5-d088-4fe5-a5e5-30c1140422f6")
        public static TagType SACOMMHOST_LIFELINE_ISSCHED_TAGTYPE_ELT;

        @objid ("fe6f70b5-fe37-4fd0-819e-c88d68c1d665")
        public static TagType SACOMMHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT;

        @objid ("a60548fc-4bd8-4768-9ea2-22787186b483")
        private static Stereotype MDAASSOCDEP;

        @objid ("d2eab3cd-6ba7-41a0-a9d8-72275802e394")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("622787ba-800b-4499-808c-9e93d0f7046a")
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
