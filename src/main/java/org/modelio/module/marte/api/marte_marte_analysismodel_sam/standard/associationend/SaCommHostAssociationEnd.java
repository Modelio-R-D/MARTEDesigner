/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaCommHostAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SaCommHost_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1a10a1da-a19d-4bca-b9d5-9a2745eca3dc")
public class SaCommHostAssociationEnd extends GaCommHostAssociationEnd {
    @objid ("fe9981cb-44de-49ae-9412-6da37390e77a")
    public static final String STEREOTYPE_NAME = "SaCommHost_AssociationEnd";

    @objid ("32e0f3e8-61b2-4243-8065-75c72bb647bb")
    public static final String SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE = "SaCommHost_AssociationEnd_isSched";

    @objid ("15749b29-f964-45e2-8e4c-48458d177ef3")
    public static final String SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE = "SaCommHost_AssociationEnd_schSlack";

    /**
     * Tells whether a {@link SaCommHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0d738fc-44d9-41f5-b2fc-1fc5d6bb506c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >> then instantiate a {@link SaCommHostAssociationEnd} proxy.
     * 
     * @return a {@link SaCommHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("45f323b5-0721-47ca-8afd-2b93076ad004")
    public static SaCommHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociationEnd.STEREOTYPE_NAME);
        return SaCommHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SaCommHostAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("b0ea7291-e6c3-464f-b0a5-816496d82b33")
    public static SaCommHostAssociationEnd instantiate(final AssociationEnd obj) {
        return SaCommHostAssociationEnd.canInstantiate(obj) ? new SaCommHostAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SaCommHostAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fa6230f3-4917-4973-8fc9-409582904485")
    public static SaCommHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SaCommHostAssociationEnd.canInstantiate(obj))
        	return new SaCommHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SaCommHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c1b564c-15a7-45f3-bca0-39133a1471f8")
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
        SaCommHostAssociationEnd other = (SaCommHostAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c3d70e46-ff50-45bc-8bfc-f2d70d14185b")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8d3019b-d84b-4e98-af01-9de39cbed12d")
    public String getSaCommHost_AssociationEnd_schSlack() {
        return this.elt.getTagValue(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("313b929d-614b-48a3-9c90-b95f8cdf417d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a19a6124-a6e8-4f31-9bd2-e802ad97d666")
    public boolean isSaCommHost_AssociationEnd_isSched() {
        return this.elt.isTagged(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a188d7e-af39-43ae-afa4-8f765c5c2b78")
    public void setSaCommHost_AssociationEnd_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af4c92ec-5a93-48f4-8e4e-8162af5a9d93")
    public void setSaCommHost_AssociationEnd_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("204c9c33-ab58-4241-905c-52569b937e30")
    protected SaCommHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("88030503-a182-4b85-ba0e-e0f5cb48512a")
    public static final class MdaTypes {
        @objid ("da310829-0eff-4e6e-972d-e100ecc82519")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b766643-f5f6-4006-ac0b-7a8101429321")
        public static TagType SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT;

        @objid ("7a2f78ce-b0b0-4b48-8b20-addb86d0d0fe")
        public static TagType SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT;

        @objid ("299969ad-29bf-41d6-bfe6-c14afd893664")
        private static Stereotype MDAASSOCDEP;

        @objid ("3db8ff56-9601-4877-8ff4-5dd785a8109d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75dc79ed-69f0-4ba3-937e-45158c076336")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9245-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c924c-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9253-0ccf-11df-8525-001302895b2b");
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
