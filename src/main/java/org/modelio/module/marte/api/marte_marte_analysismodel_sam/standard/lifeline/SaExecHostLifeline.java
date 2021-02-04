/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaExecHostLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SaExecHost_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e00f5f0c-fc6e-42b9-95b6-f26230d69c22")
public class SaExecHostLifeline extends GaExecHostLifeline {
    @objid ("3e271895-24a0-4f24-93f8-089f3905c12a")
    public static final String STEREOTYPE_NAME = "SaExecHost_Lifeline";

    @objid ("25a41f8e-9abd-49fb-88f4-7c0482e70447")
    public static final String SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE = "SaExecHost_Lifeline_ISRprioRange";

    @objid ("979f17d4-4b51-459f-94a6-0f7b703ee19c")
    public static final String SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE = "SaExecHost_Lifeline_ISRswitchT";

    @objid ("e8f0cf82-4f57-4221-b761-397415196298")
    public static final String SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE = "SaExecHost_Lifeline_isSched";

    @objid ("db39d813-3a25-4c50-b0f8-f671f1f4cb5f")
    public static final String SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE = "SaExecHost_Lifeline_schSlack";

    @objid ("00d86c15-95b9-484b-af3d-a46e95aa212f")
    public static final String SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Lifeline_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SaExecHost_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ec3b57fd-7c1c-4db3-873f-fc61ecd0dcf5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SaExecHost_Lifeline >> then instantiate a {@link SaExecHostLifeline} proxy.
     * 
     * @return a {@link SaExecHostLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("cd5fb208-b143-4787-999d-184c124f57bc")
    public static SaExecHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostLifeline.STEREOTYPE_NAME);
        return SaExecHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << SaExecHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SaExecHostLifeline} proxy or <i>null</i>.
     */
    @objid ("0d9d6c25-90fc-4c67-8691-2c301aa7d9ab")
    public static SaExecHostLifeline instantiate(final Lifeline obj) {
        return SaExecHostLifeline.canInstantiate(obj) ? new SaExecHostLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << SaExecHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SaExecHostLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ff2ad906-1537-4392-b029-130c9c946a77")
    public static SaExecHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SaExecHostLifeline.canInstantiate(obj))
        	return new SaExecHostLifeline(obj);
        else
        	throw new IllegalArgumentException("SaExecHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b114bb00-86fb-4682-9f0c-9ddcf505fce6")
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
        SaExecHostLifeline other = (SaExecHostLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("c124ff4b-dfc3-4a60-bba8-2aa95f6dc8f3")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e2242ca-bbf3-4aa9-a614-5f609f7622b0")
    public String getSaExecHost_Lifeline_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62baa20d-167b-4d56-af6d-c681c805d08b")
    public String getSaExecHost_Lifeline_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6c85675-8ca2-4f6b-b370-f01e314c6f72")
    public String getSaExecHost_Lifeline_schSlack() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6d928fe-0747-405e-821f-28bdae9d20d1")
    public String getSaExecHost_Lifeline_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("ab6a5827-6bae-4291-92fb-2990bd49e32b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd2078a2-43fa-4110-8e06-e88d80246390")
    public boolean isSaExecHost_Lifeline_isSched() {
        return this.elt.isTagged(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a9b211b-10de-43ed-94e3-825a29848afc")
    public void setSaExecHost_Lifeline_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c95ba599-9cfe-4e4a-9399-3de1abc74115")
    public void setSaExecHost_Lifeline_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b087d3bf-3f45-4fe1-b775-e0ce0aa7367b")
    public void setSaExecHost_Lifeline_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b789016-8501-41ba-91fa-824f2bb53d54")
    public void setSaExecHost_Lifeline_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23df30b6-acbe-494e-87cc-2a63fb009446")
    public void setSaExecHost_Lifeline_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("1eaafa8c-3a31-474a-b57f-62d4ff9b84b2")
    protected SaExecHostLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("1e54b74b-4b59-481e-9789-c2c5a436d364")
    public static final class MdaTypes {
        @objid ("22a55fef-36cb-4eb2-9891-83330621604c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("acc49b93-0bbd-43d5-9532-4103f9b59182")
        public static TagType SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT;

        @objid ("24ea833f-58bd-43bb-8653-a195b6e86b7f")
        public static TagType SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT;

        @objid ("7463ea79-7c52-42b8-aa74-14ede5de9f6b")
        public static TagType SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("e749a1ae-fd6d-4a32-b61d-c3fa2ac3357c")
        public static TagType SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("4fce7e6f-315f-4a86-9657-e8ec01ad40ec")
        public static TagType SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("255c5d83-d8a2-4f25-a340-60e8fb05a2d7")
        private static Stereotype MDAASSOCDEP;

        @objid ("853af807-e142-40a3-b82b-70c420c51c98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("72b68774-f238-4cfc-859e-50bf3f794aa1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f87a163a-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163b-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163c-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163d-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163e-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163f-14ad-11df-9d54-0014222a9f79");
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
